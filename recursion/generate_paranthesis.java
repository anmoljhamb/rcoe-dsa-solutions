import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> generateParenthesis(int n) {
    List<String> list = new ArrayList<String>();
    generate(n, 0, 0, "", list);
    return list;
  }

  public static void generate(int n, int openingCount, int closingCount, String ans, List<String> list) {
    if (openingCount == n && closingCount == n) {
      // System.out.println(ans);
      list.add(ans);
      return;
    }

    if (openingCount < n) {
      generate(n, openingCount + 1, closingCount, ans + "(", list);
    }

    if (closingCount < openingCount) {
      generate(n, openingCount, closingCount + 1, ans + ")", list);
    }
  }
}
