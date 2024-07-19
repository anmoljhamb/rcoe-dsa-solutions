class recursion_4 {
  public static void main(String[] args) {
    int target = 4;
    generate(target, "");
  }

  public static void generate(int target, String ans) {
    if (target < 0) {
      return;
    }
    if (target == 0) {
      System.out.println(ans);
      return;
    }

    generate(target - 1, ans + 1);
    generate(target - 2, ans + 2);
    generate(target - 3, ans + 3);
  }
}
