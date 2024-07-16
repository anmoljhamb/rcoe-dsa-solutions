class array_1 {
  public static void main(String[] args) {
    int[] arr = { -1, -2, -3 };
    // printArr(arr);
    // swap(arr, 0, 1);
    // printArr(arr);
    // System.out.println(max(arr));
    int[] arr1 = { -1, -2, -3, 5, 5 };
    int[] arr2 = { 1, 2, 3 };
    // System.out.println("Before: ");
    // System.out.println("arr1: ");
    // printArr(arr1);
    // System.out.println("arr2: ");
    // printArr(arr2);
    //
    // int[] temp = arr1;
    // arr1 = arr2;
    // arr2 = temp;
    //
    // System.out.println("After: ");
    // System.out.println("arr1: ");
    // printArr(arr1);
    // System.out.println("arr2: ");
    // printArr(arr2);
    System.out.println("The first occurence of 1 is: " + search(arr2, 1));
  }

  public static int search(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;
  }

  public static void swap(int[] arr, int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
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
