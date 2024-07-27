import java.util.*;

class Node {
  public int val;
  public Node left, right;
}

class Tree {
  Node root;
  Scanner sc = new Scanner(System.in);

  Tree() {
    root = inputTree();
  }

  public Node inputTree() {
    int temp = sc.nextInt();
    Node n = new Node();
    n.val = temp;
    boolean leftChild = sc.nextBoolean();
    if (leftChild) {
      n.left = inputTree();
    }
    boolean rightChild = sc.nextBoolean();
    if (rightChild) {
      n.right = inputTree();
    }
    return n;
  }
}

public class binary_tree {
  public static void main(String[] args) {
    Tree tree = new Tree();
  }
}
