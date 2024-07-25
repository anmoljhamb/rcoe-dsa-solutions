public class sem3day8 {
  public static void main(String[] args) {
    int n = 5;
    // printFromN(n);
    // printToN(n);
    // System.out.println(factorial(5));
    // factorial2(n, 1);
    // int a = 2;
    // int b = 10;
    // System.out.println(pow(a, b));
    // pow1(a, b);
    // pow(a, b, 1);
    // int[] arr = {1, 2, 3, 4};
    // printSubseq(arr, 0, "");
    coinToss2(n, "");
  }

  static void coinToss2(int n, String ans) {
    if (n == 0) {
      System.out.println(ans);
      return;
    }
    if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
      coinToss2(n - 1, ans + "H");
    }
    coinToss2(n - 1, ans + "T");
  }

  static void coinToss(int n, String ans) {
    if (n == 0) {
      System.out.println(ans);
      return;
    }
    coinToss(n - 1, ans + "H");
    coinToss(n - 1, ans + "T");
  }

  static void printSubseq(int[] arr, int i, String ans) {
    if (i == arr.length) {
      System.out.println(ans);
      return;
    }
    // take
    printSubseq(arr, i + 1, ans + arr[i] + " ");
    // not take
    printSubseq(arr, i + 1, ans);
  }

  static void pow(int a, int b, int ans) {
    if (b == 0) {
      System.out.println(ans);
      return;
    }
    pow(a, b - 1, a * ans);
  }

  static int ans = 1;

  static void pow1(int a, int b) {
    if (b == 0) {
      System.out.println(ans);
      return;
    }
    ans = ans * a;
    pow1(a, b - 1);
  }

  static int pow(int a, int b) {
    if (b == 0) {
      return 1;
    }
    return a * pow(a, b - 1);
  }

  static void factorial2(int n, int ans) {
    if (n == 0) {
      System.out.println(ans);
      return;
    }
    factorial2(n - 1, ans * n);
  }

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
