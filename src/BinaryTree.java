public class BinaryTree {
  BTNode root;

  public int depth(BTNode u) {
    int depth = 0;
    
    while(u != root) {
      u = u.parent;
      depth++;
    }

    return depth;
  }

  public int size(BTNode u) {
    if(u == null) return 0;

    return 1 + size(u.left) + size(u.right);
  }

  public boolean isBinarySearchTree(BTNode x) {
    if(x == null) return true;
    //if x has no children, return
    if(x.left == null && x.right == null) {
      if(x.parent.left != null && x == x.parent.left) {
        return x.value < x.parent.value;
      }
      return x.value > x.parent.value;
    }
    return isBinarySearchTree(x.left) && isBinarySearchTree(x.right);
  }
}