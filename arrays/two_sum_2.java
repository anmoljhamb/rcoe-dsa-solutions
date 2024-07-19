import java.util.ArrayList;

class Solution {
  public int[] twoSum(int[] arr, int target) {
    int left = 0, right = arr.length - 1;

    while (left < right) {
      int temp = arr[left] + arr[right];
      if (temp == target) {
        return new int[] { left + 1, right + 1 };
      }
      if (temp > target) {
        right--;
      } else {
        left++;
      }
    }

    return new int[] { -1, -1 };
  }
}
