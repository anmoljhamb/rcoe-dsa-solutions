public class recursion_3 {
  public static void main(String[] args) {
    int n = 100;
    for (int i = 1; i <= 9; i++) {
      printLexicalNumbers(n, i);
    }
  }

  public static void printLexicalNumbers(int n, int curr) {
    if (curr > n) {
      return;
    }

    System.out.println(curr);

    for (int i = 1; i <= 9; i++) {
      printLexicalNumbers(n, curr * 10 + i);
    }
  }
}
