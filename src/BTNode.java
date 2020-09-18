public class BTNode {
  BTNode parent;
  BTNode left;
  BTNode right;
  int value;
  int preOrderNumber;
  int postOrderNumber;
  int inOrderNumber;

  public BTNode(int value) {
    this.value = value;
  }
}
