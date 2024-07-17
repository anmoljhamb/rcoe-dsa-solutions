class Solution {
  public int missingNumber(int[] nums) {
    int n = nums.length;
    int sumOfNNaturalNumbers = (n * (n + 1)) / 2;
    for (int i = 0; i < n; i++) {
      sumOfNNaturalNumbers -= nums[i];
    }
    return sumOfNNaturalNumbers;
  }
}
