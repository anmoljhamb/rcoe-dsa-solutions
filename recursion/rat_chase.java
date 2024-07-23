import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    char[][] maze = new char[n][m];
    for (int i = 0; i < n; i++) {
      String str = sc.next();
      for (int j = 0; j < m; j++) {
        maze[i][j] = str.charAt(j);
      }
    }
    int[][] ans = new int[n][m];
    path(maze, ans, 0, 0);
    if (!pathFound) {
      System.out.println("NO PATH FOUND");
    }
  }

  static void display(int[][] ans) {
    for (int i = 0; i < ans.length; i++) {
      for (int j = 0; j < ans[0].length; j++) {
        System.out.print(ans[i][j] + " ");
      }
      System.out.println();
    }
  }

  static boolean pathFound = false;

  static void path(char[][] maze, int[][] ans, int row, int col) {
    if (row < 0 || row >= maze.length) {
      return;
    }
    if (col < 0 || col >= maze[0].length) {
      return;
    }
    if (maze[row][col] == 'X') {
      return;
    }
    if (row == maze.length - 1 && col == maze[0].length - 1) {
      pathFound = true;
      ans[row][col] = 1;
      display(ans);
      return;
    }

    maze[row][col] = 'X';
    ans[row][col] = 1;

    path(maze, ans, row + 1, col);
    path(maze, ans, row - 1, col);
    path(maze, ans, row, col + 1);
    path(maze, ans, row, col - 1);

    maze[row][col] = 'O';
    ans[row][col] = 0;
  }
}
