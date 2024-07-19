class Solution {
  public int numRollsToTarget(int n, int k, int target) {
    generate(target, n, k);
    return count;
  }

  public static int count = 0;

  public static void generate(int target, int n, int k) {
    if (target < 0)
      return;
    if (target == 0) {
      count++;
      return;
    }
    if (n == 0) {
      return;
    }

    for (int i = 1; i <= k; i++) {
      generate(target - i, n - 1, k);
    }
  }
}
