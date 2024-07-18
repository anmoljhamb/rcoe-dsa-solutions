public class recursion_3 {
  public static void main(String[] args) {
    int n = 100;
    printLexicalNumbers(n, 0);
  }

  public static void printLexicalNumbers(int n, int curr) {
    if (curr > n) {
      return;
    }

    System.out.println(curr);

    int i = 0;
    if (curr == 0) {
      i = 1;
    }

    for (i = 1; i <= 9; i++) {
      printLexicalNumbers(n, curr * 10 + i);
    }
  }
}
