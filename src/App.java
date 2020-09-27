public class App {
    public static void main(String[] args) throws Exception {

        BinarySearchTree BT = new BinarySearchTree();
        BT.add(9); // PreONum 1 PoONum 12 InONum 6
        BT.add(5); // PreONum 2 PoONum 5 InONum 2
        BT.add(4); // PreONum 3 PoONum 1 InONum 1
        BT.add(7); // PreONum 4 PoONum 4 InONum 4
        BT.add(6); // PreONum 5 PoONum 2 InONum 3
        BT.add(8); // PreONum 6 PoONum 3 InONum 5
        BT.add(12); // PreONum 7 PoONum 11 InONum 9
        BT.add(11); // PreONum 8 PoONum 7 InONum 8
        BT.add(10); // PreONum 9 PoONum 6 InONum 7
        BT.add(14); // PreONum 10 PoONum 10 InONum 11
        BT.add(13); // PreONum 11 PoONum 8 InONum 10
        BT.add(15); // PreONum 12 PoONum 9 InONum 12

        BTNode root = BT.findLastNode(9);
        System.out.println(BT.isBinarySearchTree(root)); // expect true

        BTNode seven = BT.findLastNode(7);
        System.out.println(BT.isBinarySearchTree(seven)); // expect true

        BTNode six = BT.findLastNode(6);
        six.value = 99;
        System.out.println(BT.isBinarySearchTree(root)); // expect false
        System.out.println(BT.isBinarySearchTree(seven)); // expect false

        BTNode twelve = BT.findLastNode(12);
        System.out.println(BT.isBinarySearchTree(twelve)); // expect true

        BTNode thirteen = BT.findLastNode(13);
        thirteen.value = 99;
        System.out.println(BT.isBinarySearchTree(twelve)); // expect false

        BTNode fourteen = BT.findLastNode(14);
        fourteen.left = null;
        System.out.println(BT.isBinarySearchTree(twelve)); // expect true

        // BTNode nine = BT.findLastNode(9);
        // BT.preOrderNumber(nine);
        // System.out.println(nine.preOrderNumber);
        // BTNode five = BT.findLastNode(5);
        // BT.preOrderNumber(five);
        // System.out.println(five.preOrderNumber);
        // BTNode four = BT.findLastNode(4);
        // BT.preOrderNumber(four);
        // System.out.println(four.preOrderNumber);
        // BTNode seven = BT.findLastNode(7);
        // BT.preOrderNumber(seven);
        // System.out.println(seven.preOrderNumber);
        // BTNode six = BT.findLastNode(6);
        // BT.preOrderNumber(six);
        // System.out.println(six.preOrderNumber);
        // BTNode eight = BT.findLastNode(8);
        // BT.preOrderNumber(eight);
        // System.out.println(eight.preOrderNumber);
        // BTNode twelve = BT.findLastNode(12);
        // BT.preOrderNumber(twelve);
        // System.out.println(twelve.preOrderNumber);
        // BTNode eleven = BT.findLastNode(11);
        // BT.preOrderNumber(eleven);
        // System.out.println(eleven.preOrderNumber);
        // BTNode ten = BT.findLastNode(10);
        // BT.preOrderNumber(ten);
        // System.out.println(ten.preOrderNumber);
        // BTNode fourteen = BT.findLastNode(14);
        // BT.preOrderNumber(fourteen);
        // System.out.println(fourteen.preOrderNumber);
        // BTNode thirteen = BT.findLastNode(13);
        // BT.preOrderNumber(thirteen);
        // System.out.println(thirteen.preOrderNumber);
        // BTNode fifteen = BT.findLastNode(15);
        // BT.preOrderNumber(fifteen);
        // System.out.println(fifteen.preOrderNumber);

        // BTNode nine = BT.findLastNode(9);
        // BT.postOrderNumber(nine);
        // System.out.println(nine.postOrderNumber);
        // BTNode five = BT.findLastNode(5);
        // BT.postOrderNumber(five);
        // System.out.println(five.postOrderNumber);
        // BTNode four = BT.findLastNode(4);
        // BT.postOrderNumber(four);
        // System.out.println(four.postOrderNumber);
        // BTNode seven = BT.findLastNode(7);
        // BT.postOrderNumber(seven);
        // System.out.println(seven.postOrderNumber);
        // BTNode six = BT.findLastNode(6);
        // BT.postOrderNumber(six);
        // System.out.println(six.postOrderNumber);
        // BTNode eight = BT.findLastNode(8);
        // BT.postOrderNumber(eight);
        // System.out.println(eight.postOrderNumber);
        // BTNode twelve = BT.findLastNode(12);
        // BT.postOrderNumber(twelve);
        // System.out.println(twelve.postOrderNumber);
        // BTNode eleven = BT.findLastNode(11);
        // BT.postOrderNumber(eleven);
        // System.out.println(eleven.postOrderNumber);
        // BTNode ten = BT.findLastNode(10);
        // BT.postOrderNumber(ten);
        // System.out.println(ten.postOrderNumber);
        // BTNode fourteen = BT.findLastNode(14);
        // BT.postOrderNumber(fourteen);
        // System.out.println(fourteen.postOrderNumber);
        // BTNode thirteen = BT.findLastNode(13);
        // BT.postOrderNumber(thirteen);
        // System.out.println(thirteen.postOrderNumber);
        // BTNode fifteen = BT.findLastNode(15);
        // BT.postOrderNumber(fifteen);
        // System.out.println(fifteen.postOrderNumber);

        // BTNode nine = BT.findLastNode(9);
        // BT.inOrderNumber(nine);
        // System.out.println(nine.inOrderNumber);
        // BTNode five = BT.findLastNode(5);
        // BT.inOrderNumber(five);
        // System.out.println(five.inOrderNumber);
        // BTNode four = BT.findLastNode(4);
        // BT.inOrderNumber(four);
        // System.out.println(four.inOrderNumber);
        // BTNode seven = BT.findLastNode(7);
        // BT.inOrderNumber(seven);
        // System.out.println(seven.inOrderNumber);
        // BTNode six = BT.findLastNode(6);
        // BT.inOrderNumber(six);
        // System.out.println(six.inOrderNumber);
        // BTNode eight = BT.findLastNode(8);
        // BT.inOrderNumber(eight);
        // System.out.println(eight.inOrderNumber);
        // BTNode twelve = BT.findLastNode(12);
        // BT.inOrderNumber(twelve);
        // System.out.println(twelve.inOrderNumber);
        // BTNode eleven = BT.findLastNode(11);
        // BT.inOrderNumber(eleven);
        // System.out.println(eleven.inOrderNumber);
        // BTNode ten = BT.findLastNode(10);
        // BT.inOrderNumber(ten);
        // System.out.println(ten.inOrderNumber);
        // BTNode fourteen = BT.findLastNode(14);
        // BT.inOrderNumber(fourteen);
        // System.out.println(fourteen.inOrderNumber);
        // BTNode thirteen = BT.findLastNode(13);
        // BT.inOrderNumber(thirteen);
        // System.out.println(thirteen.inOrderNumber);
        // BTNode fifteen = BT.findLastNode(15);
        // BT.inOrderNumber(fifteen);
        // System.out.println(fifteen.inOrderNumber);

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
        // BTNode nullNode = BT.preorderNext(fifteen);
        // System.out.println("nullNode value: " + nullNode);

        // BTNode four = BT.findLastNode(4);
        // BTNode six = BT.postorderNext(four);
        // System.out.println("six value: " + six.value);
        // BTNode eight = BT.postorderNext(six);
        // System.out.println("eight value: " + eight.value);
        // BTNode seven = BT.postorderNext(eight);
        // System.out.println("seven value: " + seven.value);
        // BTNode five = BT.postorderNext(seven);
        // System.out.println("five value: " + five.value);
        // BTNode ten = BT.postorderNext(five);
        // System.out.println("ten value: " + ten.value);
        // BTNode eleven = BT.postorderNext(ten);
        // System.out.println("eleven value: " + eleven.value);
        // BTNode thirteen = BT.postorderNext(eleven);
        // System.out.println("thirteen value: " + thirteen.value);
        // BTNode fifteen = BT.postorderNext(thirteen);
        // System.out.println("fifteen value: " + fifteen.value);
        // BTNode fourteen = BT.postorderNext(fifteen);
        // System.out.println("fourteen value: " + fourteen.value);
        // BTNode twelve = BT.postorderNext(fourteen);
        // System.out.println("twelve value: " + twelve.value);
        // BTNode nine = BT.postorderNext(twelve);
        // System.out.println("nine value: " + nine.value);
        // BTNode nullNode = BT.postorderNext(nine);
        // System.out.println("nullNode value: " + nullNode);

        // BTNode four = BT.findLastNode(4);
        // BTNode five = BT.inorderNext(four);
        // System.out.println("five value: " + five.value);
        // BTNode six = BT.inorderNext(five);
        // System.out.println("six value: " + six.value);
        // BTNode seven = BT.inorderNext(six);
        // System.out.println("seven value: " + seven.value);
        // BTNode eight = BT.inorderNext(seven);
        // System.out.println("eight value: " + eight.value);
        // BTNode nine = BT.inorderNext(eight);
        // System.out.println("nine value: " + nine.value);
        // BTNode ten = BT.inorderNext(nine);
        // System.out.println("ten value: " + ten.value);
        // BTNode eleven = BT.inorderNext(ten);
        // System.out.println("eleven value: " + eleven.value);
        // BTNode twelve = BT.inorderNext(eleven);
        // System.out.println("twelve value: " + twelve.value);
        // BTNode thirteen = BT.inorderNext(twelve);
        // System.out.println("thirteen value: " + thirteen.value);
        // BTNode fourteen = BT.inorderNext(thirteen);
        // System.out.println("fourteen value: " + fourteen.value);
        // BTNode fifteen = BT.inorderNext(fourteen);
        // System.out.println("fifteen value: " + fifteen.value);
        // BTNode nullNode = BT.inorderNext(fifteen);
        // System.out.println("nullNode value: " + nullNode);
    }
}
