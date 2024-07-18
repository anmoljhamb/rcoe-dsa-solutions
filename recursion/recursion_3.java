import java.util.ArrayList;

import com.sun.tools.javac.util.List;

public class recursion_3 {
  public static void main(String[] args) {
    int n = 100;
    List<Integer> list = new ArrayList<Integer>();

    for (int i = 1; i <= 9; i++) {
      printLexicalNumbers(n, i, list);
    }
  }

  public static void printLexicalNumbers(int n, int curr, java.util.List<Integer> list) {
    if (curr > n) {
      return;
    }

    list.add(curr);

    for (int i = 0; i <= 9; i++) {
      printLexicalNumbers(n, curr * 10 + i, list);
    }
  }
}
