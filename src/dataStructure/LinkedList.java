package dataStructure;

public class LinkedList {

  private Node head;

  private Node tail;

  private int lenght;

  public LinkedList(String data) {
    lenght = 1;
    Node newNode = new Node(data);
    head = newNode;
    tail = newNode;
  }

  public void getHead() {
    if (this.head == null) {
      System.out.println("Lista vazia");
    } else {
      System.out.println("Head: " + head.data);
    }
  }

  public void getTail() {
    if (this.tail == null) {
      System.out.println("Lista vazia");
    } else {
      System.out.println("Tail: " + tail.data);
    }
  }

  public void getLenght() {
    System.out.println("Lenght: " + this.lenght);
  }

  // metodo para deixar lista vazia
  public void makeEmpty() {
    head = null;
    tail = null;
    lenght = 0;
  }

  public void print() {
    Node temp = this.head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  public void append(String data) {
    Node newNode = new Node(data);
    if (lenght == 0) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
    lenght++;
  }

  public Node removeLast() {
    if (lenght == 00)
      return null;
    Node pre = head;
    Node temp = null;

    while (pre.next != tail) {
      pre = pre.next;
    }
    tail = pre;
    temp = tail.next;
    tail.next = null;

    lenght--;

    if (lenght == 0) {
      head = null;
      tail = null;

    }
    return temp;
  }

  public void prepend(String data) {
    Node newNode = new Node(data);
    if (lenght == 0) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
    lenght++;
  }

  public Node removeFirst() {
    if (lenght == 0)
      return null;
    Node temp = head;
    head = head.next;
    temp.next = null;
    lenght--;
    if (lenght == 0) {
      head = null;
      tail = null;
    }
    return temp;
  }

  public Node get(int index) {
    if (index < 0 || index >= lenght)
      return null;
    Node temp = head;
    for (int i = 0; i < index; i++) {
      temp = temp.next;
    }
    return temp;
  }

  public boolean set(int index, String data) {
    Node temp = get(index);
    if (temp != null) {
      temp.data = data;
      return true;
    }
    return false;
  }

  public boolean insert(int index, String data) {
    if (index < 0 || index > lenght)
      return false;
    if (index == 0) {
      prepend(data);
      return true;
    }
    if (index == lenght) {
      append(data);
      return true;
    }

    Node newNode = new Node(data);
    Node temp = get(lenght - 1);
    newNode.next = temp.next;
    temp.next = newNode;
    lenght++;
    return true;
  }

  public Node remove(int index) {
    if (index < 0 || index >= lenght)
      return null;
    if (index == 0)
      return removeFirst();
    if (index == lenght - 1)
      return removeLast();

    Node prev = get(index - 1);
    Node temp = prev.next;

    prev.next = temp.next;
    temp.next = null;
    lenght--;
    return temp;
  }

}
