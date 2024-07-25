public class sem3day8 {
  public static void main(String[] args) {
    int n = 5;
    // printFromN(n);
    printToN(n);
  }

  static void printToN(int n) {
    if (n == 0) return;
    printToN(n - 1);
    System.out.println(n);
  }

  static void printFromN(int n) {
    if (n == 0) return;
    System.out.println(n);
    printFromN(n - 1);
  }
}
