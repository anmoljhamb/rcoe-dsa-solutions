import java.util.Arrays;

public class pivot_partition {
  public static void main(String[] args) {
    int[] arr = {5, 7, 2, 1, 3, 4};
    System.out.println(Arrays.toString(arr));
    fix(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }

  static void fix(int[] arr, int si, int ei) {
    int item = arr[ei];
    int idx = si;

    for (int i = si; i < ei; i++) {
      if (arr[i] < item) {
        swap(arr, i, idx);
        idx++;
      }
    }

    swap(arr, ei, idx);
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
