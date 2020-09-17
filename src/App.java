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
        System.out.println(BT.size(BT.root));
    }
}
