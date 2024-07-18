public class recursion_3 {
  public static void main(String[] args) {
    printPath(3, 3, 0, 0, "");
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
