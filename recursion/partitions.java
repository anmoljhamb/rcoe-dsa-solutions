import java.util.*;

public class partitions {
  public static void main(String[] args) {
    String str = "nitin";
    List<String> ll = new ArrayList<>();
    List<List<String>> ans = new ArrayList<>();
    generate(str, ll, ans);
    System.out.println(ans);
  }

  static boolean isPalindrome(String str) {
    int left = 0;
    int right = str.length() - 1;
    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }

  static void generate(String str, List<String> ll, List<List<String>> ans) {
    if (str.length() == 0) {
      ans.add(new ArrayList<>(ll));
      return;
    }

    for (int i = 0; i < str.length(); i++) {
      String s = str.substring(0, i + 1);
      if (isPalindrome(s)) {
        ll.add(s);
        generate(str.substring(i + 1), ll, ans);
        ll.remove(ll.size() - 1);
      }
    }
  }
}
