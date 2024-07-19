class recursion_4 {
  public static void main(String[] args) {
    int target = 4;
    int k = 4;
    generate(target, "", k);
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
