public class BinarySearchTree extends BinaryTree {
    public int find(int x) {
        BTNode w = root;
        BTNode z = null;

        while(w != null) {
            if(x < w.value) {
                z = w;
                w = w.left;
            } else if(x > w.value) {
                w = w.right;
            } else {
                return w.value;
            }
        }
        return z == null ? null : z.value;
    }

    public boolean add(int x) {
        BTNode p = findLastNode(x);
        return addChild(p, new BTNode(x));
    }

    public BTNode findLastNode(int x) {
        BTNode w = root;
        BTNode prev = null;

        while(w != null) {
            prev = w;
            if(x < w.value) {
                w = w.left;
            } else if (x > w.value) {
                w = w.right;
            } else {
                return w;
            }
        }
        return prev;
    }

    public boolean addChild(BTNode p, BTNode u) {
        if (p == null) {
            root = u; //inserting into empty tree
        } else {
            if(u.value < p.value) {
                p.left = u;
            } else if (u.value > p.value) {
                p.right = u;
            } else {
                return false; //u.value already in the tree
            }
            u.parent = p;
        }
        return true;
    }

    public BTNode preorderNext(BTNode x) {
        if(x.left != null) {
            return x.left;
        } else if (x.right != null) {
            return x.right;
        } else {
            if(x == x.parent.left) {
                return x.parent.right;
            } else {
                BTNode p = x.parent;
                while (p.parent != null && p == p.parent.right) {
                    p = p.parent;
                }
                return p.parent.right;
            }
        }
    }

    // public BTNode postorderNext(BTNode x) {

    // }

    // public BTNode inorderNext(BTNode x) {

    // }
}
