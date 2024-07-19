class Solution {
  public List<String> letterCombinations(String digits) {
    List<String> list = new ArrayList<String>();
    printAllLetters(digits, "", list);
    return list;
  }

  public static String[] letters = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

  public static void printAllLetters(String digits, String ans, List<String> list) {
    if (digits.length() == 0) {
      // System.out.println(ans);
      if (ans.isEmpty()) {
        return;
      }
      list.add(ans);
      return;
    }
    char ch = digits.charAt(0);
    int val = (int) ch - (int) '0';

    for (int j = 0; j < letters[val].length(); j++) {
      printAllLetters(digits.substring(1), ans + letters[val].charAt(j), list);
    }

  }

}
