/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */

public class Solution extends VersionControl {
  public int firstBadVersion(int n) {
    int low = 1;
    int high = n;
    int ans = -1;

    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (isBadVersion(mid)) {
        high = mid - 1;
        ans = mid;
      } else {
        low = mid + 1;
      }
    }

    return ans;
  }
}
