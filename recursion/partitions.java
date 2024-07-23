public class partitions {
  public static void main(String[] args) {
    String str = "nitin";
    generate(str, "");
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

  
  static void generate(String str, String ans){
  if (str.length() == 0) {

    System.out.println(ans);
      return;
    }
    for (int i = 0; i < str.length(); i++) {
      String s = str.substring(0, i + 1);
    if ( isPalindrome(s) )
      generate(str.substring(i + 1), ans + s + "|");
    }
  }
}
