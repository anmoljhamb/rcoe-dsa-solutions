import java.util.ArrayList;
import java.util.List;

class recursion_4 {

  public static void main(String[] args) {
    // int target = 4;
    // int k = 4;
    // generate(target, "", k);

    // List<String> list = new ArrayList<String>();
    // printAllLetters("23", "", list);
    // return list
    // boolean[] board = { false, false, false, false };
    // int totalQueens = 2;
    // placeQueens(board, totalQueens, 0, "", 0);
    int target = 8;
    int[] coins = { 2, 3, 5 };

    coinCombinations(target, coins, "", 0);
  }

  public static void coinCombinations(int target, int[] coins, String ans, int startIndex) {
    if (target < 0) {
      return;
    }
    if (target == 0) {
      System.out.println(ans);
      return;
    }

    for (int i = startIndex; i < coins.length; i++) {
      coinCombinations(target - coins[i], coins, ans + coins[i], i);
    }
  }

  public static void coinPermutation(int target, int[] coins, String ans) {
    if (target < 0) {
      return;
    }
    if (target == 0) {
      System.out.println(ans);
      return;
    }

    for (int i = 0; i < coins.length; i++) {
      coinPermutation(target - coins[i], coins, ans + coins[i]);
    }
  }

  public static void placeQueens(boolean[] board, int totalQueens, int queens, String ans, int startIndex) {
    if (queens == totalQueens) {
      System.out.println(ans);
      return;
    }

    for (int i = startIndex; i < board.length; i++) {
      if (board[i] == false) {
        board[i] = true;
        placeQueens(board, totalQueens, queens + 1, ans + "b" + i + "q" + queens, i + 1);
        board[i] = false;
      }
    }
  }

  public static String[] letters = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

  public static void printAllLetters(String digits, String ans, List<String> list) {
    if (digits.length() == 0) {
      // System.out.println(ans);
      list.add(ans);
      return;
    }
    char ch = digits.charAt(0);
    int val = (int) ch - (int) '0';

    for (int j = 0; j < letters[val].length(); j++) {
      printAllLetters(digits.substring(1), ans + letters[val].charAt(j), list);
    }

  }

  public static void generate(int target, String ans, int k) {
    if (target < 0) {
      return;
    }
    if (target == 0) {
      System.out.println(ans);
      return;
    }

    for (int i = 1; i <= k; i++) {
      generate(target - i, ans + i, k);
    }

  }
}
