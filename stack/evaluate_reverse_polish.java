import java.util.*;

public class evaluate_reverse_polish {
  boolean isOperator(String str) {
    if (str.equals("+")) return true;
    if (str.equals("-")) return true;
    if (str.equals("/")) return true;
    if (str.equals("*")) return true;
    return false;
  }

  int evaluate(int a, int b, String operator) {
    if (operator.equals("+")) return a + b;
    if (operator.equals("-")) return a - b;
    if (operator.equals("/")) return a / b;
    if (operator.equals("*")) return a * b;
    return 0;
  }

  public int evalRPN(String[] tokens) {
    Stack<Integer> st = new Stack<>();
    for (String token : tokens) {
      if (isOperator(token)) {
        int b = st.pop();
        int a = st.pop();
        int res = evaluate(a, b, token);
        st.push(res);
      } else {
        st.push(Integer.parseInt(token));
      }
    }
    return st.peek();
  }
}
