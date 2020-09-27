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
}