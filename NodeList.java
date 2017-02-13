public class NodeList {
  Node head;
  Node tail;
  int length;

  public NodeList() {
    head = null;
    tail = null;
  }

  public void addNodeStart(String inWord) {
    Node newNode = new Node(inWord);

    if (head == null) {
      head = newNode;
      tail = newNode;
      length ++;
      return;
    }

    Node prev = null;

    for (Node curr = head; curr != null; curr = curr.getNext()) {
      if (curr.charValueOfFirstLetter() >= newNode.charValueOfFirstLetter()) {
        if (curr == head) {
          head = newNode;
        }
        else {
          prev.setNext(newNode);
        }
        newNode.setNext(curr);
        length ++;
        return;
      }
      prev = curr;
    }
    prev.setNext(newNode);
    tail = newNode;
    length ++;
  
  }

  public void remove (String word) {
    if (head == null)
      return;

    Node prev = null;

    for (Node curr = head; curr != null; curr.getNext()) {
      if (curr.getWord() == word) {
        if (curr == head) {
          head = curr.getNext();
        }
        else {
          prev.setNext(curr.getNext());
          if (curr == tail) {
            tail = prev;
          }
        }
        curr = null;
        return;
      }
      prev = curr;
    }
  }

  public String display() {
    String string = "";
    for (Node curr = head; curr != null; curr = curr.getNext()) {
      string = string + curr.getWord() + "\n";
    }
    return string;
  }
}