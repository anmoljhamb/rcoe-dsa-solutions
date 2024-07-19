class insertion_sort {
  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1 };
    print(arr);
    sort(arr);
    print(arr);

  }

  public static void sort(int[] arr){
    for ( int i=1; i<arr.length; i++){
      fixLastElement(arr, i);
    }
  }

  public static void fixLastElement(int[] arr, int i) {
    int item = arr[i];
    int j = i - 1;

    while (j >= 0 && arr[j] > item) {
      arr[j + 1] = arr[j];
      j--;
    }
    arr[j + 1] = item;
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

}
