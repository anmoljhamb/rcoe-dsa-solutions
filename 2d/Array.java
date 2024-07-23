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

    for (int col = 0; col < m; col++) {
      if (col % 2 == 0) {
        // print straight
        for (int i = 0; i < n; i++) {
          System.out.print(arr[i][col] + " ");
        }
      } else {
        //  print reverse
        for (int i = n - 1; i >= 0; i--) {
          System.out.print(arr[i][col] + " ");
        }
      }
    }
  }
}
