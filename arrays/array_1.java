class array_1 {
  public static void main(String[] args) {
    int[] arr = { -1, -2, -3 };
    printArr(arr);
    System.out.println(max(arr));
  }

  public static int max(int[] arr) {
    int ans = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > ans) {
        ans = arr[i];
      }
    }
    return ans;
  }

  public static void printArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
