package pilha;

public class Stack {

  private Node top;
  private int height;

  public Stack(int value) {
    Node newNode = new Node(value);
    top = newNode;
    height = 1;
  }

  public void getTop() {
    if (top == null) {
      System.out.println("Pilha vazia");
    } else {
      System.out.println("Topo: " + top.value);
    }
  }

  public void getHeight() {
    System.out.println("Altura: " + height);
  }

  public void print() {
    System.out.println("IMPRESSÃO DE PILHA");
    Node temp = top;
    while (temp != null) {
      System.out.println(temp.value);
      temp = temp.next;
    }
  }

  public void push(int value) {
    Node newNode = new Node(value);
    if (height == 0) {
      top = newNode;
    } else {
      newNode.next = top;
      top = newNode;
    }
    height++;
  }

  public Node pop() {
    if (height == 0)
      return null;

    Node temp = top;
    top = top.next;
    temp.next = null;
    height--;

    return temp;
  }
}
