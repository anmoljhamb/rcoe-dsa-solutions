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
}

public class linked_list {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }
}
