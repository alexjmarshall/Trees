public class App {
    public static void main(String[] args) throws Exception {

        BinarySearchTree BT = new BinarySearchTree();
        BT.add(3);
        System.out.println(BT.size(BT.root));
        BT.add(3);
        System.out.println(BT.size(BT.root));
        BT.add(2);
        BT.add(5);
        System.out.println(BT.size(BT.root));
    }
}
