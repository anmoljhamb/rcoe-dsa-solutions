public class partitions {
  public static void main(String[] args) {
    String str = "aab";
    generate(str, "");
  }

  static void generate(String str, String ans) {
    if (str.length() == 0) {
      System.out.println(ans);
      return;
    }
    for (int i = 0; i < str.length(); i++) {
      String s = str.substring(0, i + 1);
      generate(str.substring(i + 1), ans + s + "|");
    }
  }
}
