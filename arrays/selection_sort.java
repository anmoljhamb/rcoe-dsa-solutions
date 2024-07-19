
class selection_sort {
  public static void main(String[] args) {
    int[] arr = { 9, 8, 7, 6, 5 };
    print(arr);
    sort(arr);
    print(arr);
  }

  public static void sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int minIdx = getMinIndx(arr, i);
      swap(arr, i, minIdx);
    }
  }

  public static int getMinIndx(int[] arr, int i) {
    int minIdx = i;
    for (int j = i + 1; j < arr.length; j++) {
      if (arr[j] < arr[minIdx]) {
        minIdx = j;
      }
    }
    return minIdx;
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
