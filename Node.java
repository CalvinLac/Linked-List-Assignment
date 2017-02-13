public class Node {

  private String word;
  private Node next;


  public Node (String inWord) {
    this.word = inWord;
    next = null;
  }

  public Node() {
    this("");
  }

  public String getWord() {
    return word;
  }

  public void setNext(Node nextNode) {
    this.next = nextNode;
  }

  public Node getNext() {
    return next;
  }

  public int getLengthOfWord () {
    int wordLength = word.length();
    return wordLength;
  }

  public int charValueOfFirstLetter () {
    int ascii = (int) word.charAt(0);
    return ascii;
  }
}