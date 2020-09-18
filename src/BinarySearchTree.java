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

        while(x != null) {
            x = preorderNext(x);
            n++;
        }

        node.preOrderNumber = size() - n + 1;
    }

    public BTNode postorderNext(BTNode x) {
        BTNode p = x.parent;

        if(p == null) {
            return null;
        } else if(x == p.right) {
            return p;
        } else {
            BTNode r = p.right;
            if(r == null) return p;

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

        while(x != null) {
            x = postorderNext(x);
            n++;
        }

        node.postOrderNumber = size() - n + 1;
    }

    public BTNode inorderNext(BTNode x) {
        if(x.right != null) {
            BTNode r = x.right;

            while(r.left != null) {
                r = r.left;
            }

            return r;
        } else {
            if(x == x.parent.left) {
                return x.parent;
            } else {
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

        node.inOrderNumber = size() - n + 1;
    } 
}
