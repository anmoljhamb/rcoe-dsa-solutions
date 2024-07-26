class Node {
  public int val;
  public Node next;
}

class LinkedList {
  Node head, tail;
  int size = 0;

  public void addFirst(int val) {
    Node n = new Node();
    n.val = val;
    if (size == 0) {
      head = n;
      tail = n;
      size++;
      return;
    }
    n.next = head;
    head = n;
    size++;
  }

  public int getFirst() {
    return head.val;
  }

  Node getNodeAtIndex(int index) {
    Node temp = head;
    while (index > 0) {
      temp = temp.next;
      index--;
    }
    return temp;
  }

  public int getAtIndex(int index) {
    return getNodeAtIndex(index).val;
  }

  public int getLast() {
    return tail.val;
  }

  public void addAtIndex(int val, int index) {
    if (index >= size) {
      return;
    }

    Node temp = head;
    for (int i = 0; i < index - 1; i++) {
      temp = temp.next;
    }
    Node n = new Node();
    n.val = val;
    n.next = temp.next;
    temp.next = n;
  }

  public void addLast(int val) {
    if (size == 0) {
      addFirst(val);
      return;
    }
    Node n = new Node();
    n.val = val;
    tail.next = n;
    tail = n;
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.val + "-->");
      temp = temp.next;
    }
    System.out.println();
  }
}

public class linked_list {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.addFirst(1);
    list.addFirst(2);
    list.addFirst(3);
    list.display();
    list.addFirst(4);
    list.display();
    list.addLast(0);
    list.addLast(-1);
    list.display();
    list.addAtIndex(7, 2);
    list.display();
    System.out.println("head: " + list.getFirst());
    System.out.println("tail: " + list.getLast());
    System.out.println("at 2: " + list.getAtIndex(2));
  }
}
