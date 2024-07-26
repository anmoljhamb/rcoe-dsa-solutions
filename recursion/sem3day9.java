public class sem3day9 {
  public static void main(String[] args) {
    int k = 7;
    // boardPath(4, "", k);
    mazePath(3, 3, 0, 0, "");
  }

  public static void mazePath(int m, int n, int row, int col, String ans) {
    if (row >= m || col >= n) {
      return;
    }
    if (row == m - 1 && col == n - 1) {
      System.out.println(ans);
      return;
    }
    mazePath(m, n, row + 1, col, ans + "D");
    mazePath(m, n, row, col + 1, ans + "R");
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
