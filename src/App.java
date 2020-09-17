public class App {
    public static void main(String[] args) throws Exception {

        // BinarySearchTree BT = new BinarySearchTree();
        // BT.add(3);
        // System.out.println(BT.size(BT.root));
        // BT.add(3);
        // System.out.println(BT.size(BT.root));
        // BT.add(2);
        // BT.add(5);
        // System.out.println(BT.size(BT.root));

        BinarySearchTree BT = new BinarySearchTree();
        BT.add(9);
        BT.add(5);
        BT.add(4);
        BT.add(7);
        BT.add(6);
        BT.add(8);
        BT.add(12);
        BT.add(11);
        BT.add(10);
        BT.add(14);
        BT.add(13);
        BT.add(15);

        BTNode five = BT.preorderNext(BT.root);
        BTNode four = BT.preorderNext(five);
        BTNode seven = BT.preorderNext(four); //then this was null
        BTNode six = BT.preorderNext(seven);
        BTNode eight = BT.preorderNext(six);
        BTNode twelve = BT.preorderNext(eight);
        BTNode eleven = BT.preorderNext(twelve);
        BTNode ten = BT.preorderNext(eleven);
        BTNode fourteen = BT.preorderNext(ten); //this was null -- 
        BTNode thirteen = BT.preorderNext(fourteen);
        BTNode fifteen = BT.preorderNext(thirteen);
    }
}
