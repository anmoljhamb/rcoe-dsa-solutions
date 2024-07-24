public class implement {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int target = 5;
    int index = binary_search(arr, target);
    System.out.println("The element was at " + index);
  }

  static int binary_search(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] == target) {
        return mid;
      }

      if (arr[mid] > target) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    return -1;
  }
}
