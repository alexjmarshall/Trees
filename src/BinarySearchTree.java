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
        if(x.left != null) { // 1
            return x.left;
        } else if (x.right != null) { // 1
            return x.right;
        } else {
            // go up the tree until find a new right node to visit 
            BTNode prev = x; // 1
            BTNode p = x.parent; // 1
            
            while(p.right == null || p.right == prev) { // 2
                prev = p; // 1
                p = p.parent; // 1
            } // total: 4 * height of tree in worst case, which equals n in worst case

            if(p.right != null) { // 1
                return p.right;
            } else {
                return null;
            }
        }
    }

    public BTNode postorderNext(BTNode x) {
        // go to parent
        // if parent is null, return null
        // if this node is right node of parent, return parent
        // if this node is left node of parent, go to parents right node, and travel down left
        // side until find leaf, and return

        BTNode p = x.parent;

        if(p == null) {
            return null;
        } else if(x == p.right) {
            return p;
        } else {
            BTNode r = p.right;
            if(r == null) return p;

            while(r.left != null || r.right != null) { //changed from and to or
                if(r.left != null) {
                    r = r.left;
                    continue;
                }
                r = r.right;
            }

            return r;
        }
    }

    // public BTNode inorderNext(BTNode x) {

    // }
}
