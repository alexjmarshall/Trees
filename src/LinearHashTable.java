public class LinearHashTable {
    Object[] t; // the table
    int n; // the size
    int d; // t.length = 2^d
    int q; // the number of non-null entries in t

    class del {
        
    }

    public Integer find(Integer x) {
        int i = hash(x);

        while(t[i] != null) {
            if(!(t[i] instanceof del) && x.equals(t[i]))
                return (Integer)t[i];
            i = (i == t.length-1) ? 0 : i + 1; // increment 1
        }

        return null;
    }

    public boolean add(Integer x) {
        if(find(x) != null) return false;

        if(2*(q+1) > t.length) resize(); // max 50% occupancy

        int i = hash(x);

        while(t[i] != null && !(t[i] instanceof del))
            i = (i == t.length-1) ? 0 : i + 1; // increment i
        
        if(t[i] == null) q++;
        n++;
        t[i] = x;
        return true;
    }

    public Integer remove(Integer x) {
        int i = hash(x);

        while(t[i] != null) {
            Object y = t[i];

            if(!(y instanceof del) && x.equals(y)) {
                t[i] = new del();
                n--;
                if(8*n < t.length) resize(); // min 12.5% occupancy
                return (Integer)y;
            }

            i = (i == t.length-1) ? 0 : i + 1; // increment i
        }

        return null;
    }

    private void resize() {
        d = 1;

        while((1<<d) < 3*n) d++;

        Object[] told = t;
        t = new Object[1<<d];
        q = n;

        // insert everything from told
        for(int k = 0; k < told.length; k++) {
            if(told[k] != null && !(told[k] instanceof del)) {
                int i = hash((Integer)told[k]);

                while(t[i] != null)
                    i = (i == t.length-1) ? 0 : i + 1;
                t[i] = told[k];
            }
        }
    }

    private int hash(Integer x) {
        return x % 13;
    }
    
    public static void main(String args[]) {
        LinearHashTable t = new LinearHashTable();

        t.add(1);
        t.add(5);
        t.add(21);
        t.add(26);
        t.add(39);
        t.add(14);
        t.add(15);
        t.add(16);
        t.add(17);
        t.add(18);
        t.add(19);
        t.add(20);
        t.add(111);
        t.add(145);
        t.add(146);
    }
}
