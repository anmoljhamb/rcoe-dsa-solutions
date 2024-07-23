public class transpose {
  public static void main(String[] args) {
    int n = 3;
    int m = 3;

    int[][] arr = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9},
    };

    System.out.println("Before Transpose: ");
    display(arr);

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < i; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }

    System.out.println("After transpose: ");
    display(arr);
  }

  static void display(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
