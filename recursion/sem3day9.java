public class sem3day9 {
  public static void main(String[] args) {
    int k = 7;
    boardPath(4, "", k);
  }

  public static void boardPath(int target, String ans, int k) {
    if (target < 0) {
      return;
    }
    if (target == 0) {
      System.out.println(ans);
      return;
    }
    for (int i = 1; i <= k; i++) {
      boardPath(target - i, ans + i, k);
    }
  }
}
