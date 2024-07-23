import java.util.*;

public class Array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, m;

    n = sc.nextInt();
    m = sc.nextInt();

    int[][] arr = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(2 * arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
