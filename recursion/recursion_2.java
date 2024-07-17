class recursion_2 {
  public static void main(String[] args) {
    // int[] arr = { 1, 2, 3 };
    // printSubSeq(arr, 0, "");
    // System.out.println("The number of subsequences: " + count);
    int n = 2;
    // coinToss(n, "");
    printAllPossibleDie(n, "");
  }

  public static void printAllPossibleDie(int n, String ans) {
    if (n == 0) {
      System.out.println(ans);
      return;
    }
    printAllPossibleDie(n - 1, ans + 1);
    printAllPossibleDie(n - 1, ans + 2);
    printAllPossibleDie(n - 1, ans + 3);
    printAllPossibleDie(n - 1, ans + 4);
    printAllPossibleDie(n - 1, ans + 5);
    printAllPossibleDie(n - 1, ans + 6);
  }

  public static int count = 0;

  public static void printSubSeq(int[] arr, int startIndex, String ans) {
    if (startIndex == arr.length) {
      // Print the current ans
      System.out.println(ans);
      count++;
      return;
    }
    printSubSeq(arr, startIndex + 1, ans); // Not Take
    printSubSeq(arr, startIndex + 1, ans + arr[startIndex]); // Take
  }

  public static void coinToss(int n, String ans) {
    if (n == 0) {
      System.out.println(ans);
      return;
    }
    coinToss(n - 1, ans + "H");
    coinToss(n - 1, ans + "T");
  }

  public static void coinToss2(int n, String ans) {
    if (n == 0) {
      System.out.println(ans);
      return;
    }
    if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
      coinToss(n - 1, ans + "H");
    }
    coinToss(n - 1, ans + "T");
  }
}
