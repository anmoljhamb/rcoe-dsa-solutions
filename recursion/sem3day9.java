public class sem3day9 {
  public static void main(String[] args) {
    boardPath(4, "");
  }

  public static void boardPath(int target, String ans) {
    if (target < 0) {
      return;
    }
    if (target == 0) {
      System.out.println(ans);
      return;
    }
    boardPath(target - 1, ans + 1);
    boardPath(target - 2, ans + 2);
    boardPath(target - 3, ans + 3);
  }
}
