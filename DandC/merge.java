public class merge {
  public static void main(String[] args) {
    int[] arr1 = {1, 3, 5, 7};
    int[] arr2 = {2, 4, 6, 8, 10};
    System.out.println("arr1: ");
    print(arr1);
    System.out.println("arr2: ");
    print(arr2);
    int[] res = mergeArrays(arr1, arr2);
    System.out.println("result: ");
    print(res);
  }

  static void print(int[] arr) {
    for (int x : arr) {
      System.out.print(x + " ");
    }
    System.out.println();
  }

  static int[] mergeArrays(int[] arr1, int[] arr2) {
    int[] arr = new int[arr1.length + arr2.length];
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] < arr2[j]) {
        arr[k] = arr1[i];
        i++;
      } else {
        arr[k] = arr2[j];
        j++;
      }
      k++;
    }

    while (i < arr1.length) {
      arr[k] = arr1[i];
      k++;
      i++;
    }

    while (j < arr2.length) {
      arr[k] = arr2[j];
      k++;
      j++;
    }

    return arr;
  }
}
