import java.util.*;

class Solution {

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<Integer> ll = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();
    coinCombinations(target, candidates, ll, 0, ans);
    return ans;
  }

  public static void coinCombinations(int target, int[] coins, List<Integer> list, int startIndex,
      List<List<Integer>> ans) {
    if (target < 0) {
      return;
    }
    if (target == 0) {
      List<Integer> temp = new ArrayList<>(list);
      ans.add(temp);
      return;
    }
    for (int i = startIndex; i < coins.length; i++) {
      list.add(coins[i]);
      coinCombinations(target - coins[i], coins, list, i, ans);
      list.remove(list.size() - 1);
    }
  }
}

  
