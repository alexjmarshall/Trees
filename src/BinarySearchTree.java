public class BinarySearchTree extends BinaryTree {
    int n = 0;

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
        if(addChild(p, new BTNode(x))) {
            n++;
            return true;
        }
        return false;
    }

    public int size() {
        return n;
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
            root = u; // inserting into empty tree
        } else {
            if(u.value < p.value) {
                p.left = u;
            } else if (u.value > p.value) {
                p.right = u;
            } else {
                return false; // u.value already in the tree
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
            // go up the tree until find a new right node to visit 
            BTNode prev = x;
            BTNode p = x.parent;
            
            while(p.right == null || p.right == prev) {
                prev = p;
                if(p.parent == null) return null;
                p = p.parent;
            }

            if(p.right != null) {
                return p.right;
            } else {
                return null;
            }
        }
    }

    public void preOrderNumber(BTNode x) {
        int n = 0;
        BTNode node = x;

        // count nodes from x to end of tree in preOrder
        while(x != null) {
            x = preorderNext(x);
            n++;
        }
        // remove extra increment from null node at end of list
        n--;
        // preOrderNumber of x = total size of tree - number of nodes from x to end
        node.preOrderNumber = size() - n;
    }

    public BTNode postorderNext(BTNode x) {
        // visit a node only after visiting all its children
        BTNode p = x.parent;

        if(p == null) {
            return null;
        } else if(x == p.right) { // if last node was right child, can visit parent
            return p;
        } else {
            BTNode r = p.right;
            if(r == null) return p; // if no right child, can visit parent

            while(r.left != null || r.right != null) {
                if(r.left != null) {
                    r = r.left;
                } else {
                    r = r.right;
                }
            }
            return r;
        }
    }

    public void postOrderNumber(BTNode x) {
        int n = 0;
        BTNode node = x;

        // count nodes from x to end of tree in postOrder
        while(x != null) {
            x = postorderNext(x);
            n++;
        }
        // remove extra increment from null node at end of list
        n--;
        // preOrderNumber of x = total size of tree - number of nodes from x to end
        node.postOrderNumber = size() - n;
    }

    public BTNode inorderNext(BTNode x) {
        // visit a node after visiting left subtree, but before right subtree
        if(x.right != null) { // if x has a right child, go right, then down left side
            BTNode r = x.right;

            while(r.left != null) {
                r = r.left;
            }
            return r;
        } else {
            if(x == x.parent.left) { // if x is left child, visit parent
                return x.parent;
            } else { // if x is right child, go up tree until node is null or a left child
                BTNode p = x.parent;

                while(p.parent != null && p == p.parent.right) {
                    p = p.parent;
                }
                return p.parent;
            }
        }
    }

    public void inOrderNumber(BTNode x) {
        int n = 0;
        BTNode node = x;

        while(x != null) {
            x = inorderNext(x);
            n++;
        }
        // remove extra increment from null node at end of list
        n--;
        // preOrderNumber of x = total size of tree - number of nodes from x to end
        node.inOrderNumber = size() - n;
    } 

    public boolean isBinarySearchTree(BTNode x) {
        // if x has no children, return
        if(x == null) return true;
        // if x has no children, evaluate if its in correct position relative to parent
        if(x.left == null && x.right == null) {
            if(x.parent.left != null && x == x.parent.left) {
                return x.value < x.parent.value;
            }
            return x.value > x.parent.value;
        }
        return isBinarySearchTree(x.left) && isBinarySearchTree(x.right);
    }
}
