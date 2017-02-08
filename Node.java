public class Node {

  private int data;
  private Node next;


  public Node(int data) {
    this.data = data;
    next = null;
  }

  public Node() {
    this(0);
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public void setNext(Node nextNode) {
    this.next = nextNode;
  }

  public Node getNext() {
    return next;
  }
}