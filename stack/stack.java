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

    // insert(st, 5);
    reverse(st);

    System.out.println(st);
  }

  public boolean isOpening(char ch) {
    if (ch == '(') {
      return true;
    }
    if (ch == '{') {
      return true;
    }
    if (ch == '[') {
      return true;
    }
    return false;
  }

  public boolean isMatching(char opening, char closing) {
    if (opening == '(' && closing == ')') {
      return true;
    }
    if (opening == '{' && closing == '}') {
      return true;
    }
    if (opening == '[' && closing == ']') {
      return true;
    }
    return false;
  }

  public boolean isValid(String s) {
    Stack<Character> st = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (isOpening(ch)) {
        st.push(ch);
      } else {
        if (st.isEmpty()) {
          return false;
        }
        char top = st.peek();
        if (!isMatching(top, ch)) {
          return false;
        } else {
          st.pop();
        }
      }
    }
    return st.isEmpty();
  }

  static void reverse(Stack<Integer> st) {
    if (st.empty()) {
      return;
    }
    int temp = st.pop();
    reverse(st);
    insert(st, temp);
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
