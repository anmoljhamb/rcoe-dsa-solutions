class max_subarray {
  public static void main(String[] args) {
    int[] arr = { 2, 3, -6, 11, 4, -5, 9 };
    System.out.println(maxSum(arr));
  }

  public static int maxSum(int[] arr) {
    int max = Integer.MIN_VALUE;
    int currSum = 0;

    for (int i = 0; i < arr.length; i++) {
      currSum += arr[i];
      if (currSum > max) {
        max = currSum;
      }
      if (currSum < 0) {
        currSum = 0;
      }
    }

    return max;
  }
}
