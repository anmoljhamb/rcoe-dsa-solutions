public class sem3day8 {
  public static void main(String[] args) {
    int n = 5;
    // printFromN(n);
    // printToN(n);
    // System.out.println(factorial(5));
    factorial2(n, 1);
  }

  static void factorial2(int n, int ans) {
    if (n == 0) {
      System.out.println(ans);
      return;
    }
    factorial2(n - 1, ans * n);
  }

  static int ans = 1;

  static void factorial1(int n) {
    if (n == 0) {
      System.out.println(ans);
      return;
    }
    ans = ans * n;
    factorial1(n - 1);
  }

  static int factorial(int n) {
    if (n == 0) return 1;
    return n * factorial(n - 1);
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
