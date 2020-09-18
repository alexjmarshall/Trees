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
        // BT.add(6); eliminated this so I could make sure we go from 4 to 8, checking for case where node only has a right child
        BT.add(8);
        BT.add(12);
        BT.add(11);
        BT.add(10);
        BT.add(14);
        BT.add(13);
        BT.add(15);

        // BTNode five = BT.preorderNext(BT.root);
        // System.out.println("five value: " + five.value);
        // BTNode four = BT.preorderNext(five);
        // System.out.println("four value: " + four.value);
        // BTNode seven = BT.preorderNext(four);
        // System.out.println("seven value: " + seven.value);
        // BTNode six = BT.preorderNext(seven);
        // System.out.println("six value: " + six.value);
        // BTNode eight = BT.preorderNext(six);
        // System.out.println("eight value: " + eight.value);
        // BTNode twelve = BT.preorderNext(eight);
        // System.out.println("twelve value: " + twelve.value);
        // BTNode eleven = BT.preorderNext(twelve);
        // System.out.println("eleven value: " + eleven.value);
        // BTNode ten = BT.preorderNext(eleven);
        // System.out.println("ten value: " + ten.value);
        // BTNode fourteen = BT.preorderNext(ten);
        // System.out.println("fourteen value: " + fourteen.value);
        // BTNode thirteen = BT.preorderNext(fourteen);
        // System.out.println("thirteen value: " + thirteen.value);
        // BTNode fifteen = BT.preorderNext(thirteen);
        // System.out.println("fiften value: " + fifteen.value);

        BTNode four = BT.findLastNode(4);
        BTNode six = BT.postorderNext(four);
        System.out.println("six value: " + six.value);
        BTNode eight = BT.postorderNext(six);
        System.out.println("eight value: " + eight.value);
        BTNode seven = BT.postorderNext(eight);
        System.out.println("seven value: " + seven.value);
        BTNode five = BT.postorderNext(seven);
        System.out.println("five value: " + five.value);
        BTNode ten = BT.postorderNext(five);
        System.out.println("ten value: " + ten.value); //this value was 11
        BTNode eleven = BT.postorderNext(ten);
        System.out.println("eleven value: " + eleven.value);
        BTNode thirteen = BT.postorderNext(eleven);
        System.out.println("thirteen value: " + thirteen.value);
        BTNode fifteen = BT.postorderNext(thirteen);
        System.out.println("fifteen value: " + fifteen.value);
        BTNode fourteen = BT.postorderNext(fifteen);
        System.out.println("fourteen value: " + fourteen.value);
        BTNode twelve = BT.postorderNext(fourteen);
        System.out.println("twelve value: " + twelve.value); //this value was 13...using wrong method
        BTNode nine = BT.postorderNext(twelve);
        System.out.println("nine value: " + nine.value);
    }
}
