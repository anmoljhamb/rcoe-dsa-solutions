import java.util.Arrays;

public class merge_sorted {
  public static void main(String[] args) {
    int[] arr = {7, 5, 2, 1, 3, 4};
    System.out.println(Arrays.toString(arr));
    int[] res = sort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(res));
  }

  static int[] sort(int[] arr, int low, int high) {
    if (low == high) {
      return new int[] {arr[low]};
    }

    int mid = (low + high) / 2;
    int[] t1 = sort(arr, low, mid);
    int[] t2 = sort(arr, mid + 1, high);

    return mergeArrays(t1, t2);
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
