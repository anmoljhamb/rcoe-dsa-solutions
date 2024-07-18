public class recursion_3 {
  public static void main(String[] args) {
    // printPath(3, 3, 0, 0, "");
    String str = "aab";
    printPermutations2(str, "");
  }

  public static void printPermutations2(String str, String ans) {
    if (str.length() == 0) {
      System.out.println(ans);
      return;
    }

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      boolean found = false;
      for (int j = i + 1; j < str.length(); j++) {
        if (str.charAt(j) == ch) {
          found = true;
          break;
        }
      }
      if (!found) {
        printPermutations2(str.substring(0, i) + str.substring(i + 1), ans + ch);
      }
    }
  }

  public static void printPermutations(String str, String ans) {
    if (str.length() == 0) {
      System.out.println(ans);
      return;
    }

    for (int i = 0; i < str.length(); i++) {
      printPermutations(str.substring(0, i) + str.substring(i + 1), ans + str.charAt(i));
    }
  }

  public static void printPath(int m, int n, int i, int j, String ans) {
    if (i == (m - 1) && j == (n - 1)) {
      System.out.println(ans);
      return;
    }

    if (i >= m) {
      return;
    }

    if (j >= n) {
      return;
    }

    printPath(m, n, i + 1, j, ans + "V");
    printPath(m, n, i, j + 1, ans + "H");
  }
}
