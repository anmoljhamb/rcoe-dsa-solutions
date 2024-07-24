class Solution {

  public int currentTime(int[] piles, int k) {
    int ans = 0;
    for (int x : piles) {
      ans += Math.ceil((double) x / (double) k);
    }
    return ans;
  }

  public int maxArr(int[] arr) {
    int ans = Integer.MIN_VALUE;
    for (int x : arr) {
      ans = Math.max(ans, x);
    }
    return ans;
  }

  public int minEatingSpeed(int[] piles, int h) {
    int low = 1;
    int high = maxArr(piles);
    int ans = high;

    while (low <= high) {
      int mid = (low + high) / 2;
      int hours = currentTime(piles, mid);

      if (hours <= h) {
        ans = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    return ans;
  }
}
