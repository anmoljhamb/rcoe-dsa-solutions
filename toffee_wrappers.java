class toffee_wrappers {
  public static void main(String[] args) {
    int n = 30;
    int ans = 0;
    int k = 5;
    while (n > 0) {
      ans += n;
      n /= k;
    }
    System.out.println(ans);
  }
}
