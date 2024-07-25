import java.util.*;

public class stack {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();

    // pushing.
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);

    System.out.println(st);

    insert(st, 5);

    System.out.println(st);
  }

  static void insert(Stack<Integer> st, int val) {
    if (st.isEmpty()) {
      st.push(val);
      return;
    }
    int temp = st.pop();
    insert(st, val);
    st.push(temp);
  }

  static void insertAtFirst(Stack<Integer> st, int val) {
    Stack<Integer> temp = new Stack<>();
    while (!st.isEmpty()) {
      temp.push(st.pop());
    }
    st.push(val);
    while (!temp.isEmpty()) {
      st.push(temp.pop());
    }
  }
}
