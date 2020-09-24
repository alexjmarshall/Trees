public class ScapegoatTree extends BinarySearchTree {
    int q;
    
    public boolean add(int x) {
        // first do basic insertion keeping track of depth
        BTNode u = new BTNode(x);
        int d = addWithDepth(u);
        if(d > log32(q)) {
            // depth exceeded, find scapegoat
            BTNode w = u.parent;
            while(3*size(w) <= 2*size(w.parent))
                w = w.parent;
            rebuild(w.parent);
        }
        return d >= 0;
    }

    /**
	 * Compute the ceiling of log_{3/2}(q)
	 * @param q
	 * @return the ceiling of log_{3/2}(q)
	 */
	protected static final int log32(int q) {
		final double log23 = 2.4663034623764317;
		return (int)Math.ceil(log23*Math.log(q));
	}

	/***
	 * Do a normal BinarySearchTree insertion, but return the depth
	 * of the newly inserted node. 
	 * @param u - the new node to insert
	 * @return the depth of the newly inserted node, or -1 if the node
	 * was not inserted
	 */
	int addWithDepth(BTNode u) {
		BTNode w = root;
		if (w == null) {
			root = u;
			n++; q++;
			return 0;
		}
		boolean done = false;
		int d = 0;
		do {
			if (u.value < w.value) {
				if (w.left == null) {
					w.left = u;
					u.parent = w;
					done = true;
				} else {
					w = w.left;
				}
			} else if (u.value > w.value) {
				if (w.right == null) {
					w.right = u;
					u.parent = w;
					done = true;
				}
				w = w.right;
			} else {
				return -1;
			}
			d++;
		} while (!done);
		n++; q++;
		return d;
	}
    
    public void rebuild(BTNode u) {
        int ns = size(u); // Reflection -- forgot u parameter!
        BTNode p = u.parent;
        BTNode[] a = new BTNode[ns];
        
        packIntoArray(u, a, 0);

        if(p == null) {
            root = buildBalanced(a, 0, ns);
            root.parent = null;
        } else if (p.right == u) {
            p.right = buildBalanced(a, 0, ns);
            p.right.parent = p;
        } else {
            p.left = buildBalanced(a, 0, ns);
            p.left.parent = p;
        }
    }

    protected int packIntoArray(BTNode u, BTNode[] a, int i) {
		if (u == null) {
			return i;
		}
		i = packIntoArray(u.left, a, i);
		a[i++] = u;
		return packIntoArray(u.right, a, i);
	}

	/**
	 * A recursive helper that builds a perfectly balanced subtree out of
	 * a[i],...,a[i+ns-1]
	 * 
	 * @param a
	 * @param i
	 * @param ns
	 * @return the rooted of the newly created subtree
	 */
	protected BTNode buildBalanced(BTNode[] a, int i, int ns) {
		if (ns == 0)
			return null;
		int m = ns / 2;
		a[i + m].left = buildBalanced(a, i, m);
		if (a[i + m].left != null)
			a[i + m].left.parent = a[i + m];
		a[i + m].right = buildBalanced(a, i + m + 1, ns - m - 1);
		if (a[i + m].right != null)
			a[i + m].right.parent = a[i + m];
		return a[i + m];
	}

    public static void main(String args[]) {
        ScapegoatTree t = new ScapegoatTree();

        // t.add(1);
        // t.add(5);
        // t.add(2);
        // t.add(4);
        // t.add(3);
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(5);
        t.add(6);
        t.add(7);
        t.add(8);
        t.add(9);
        t.add(10);
    }
}
