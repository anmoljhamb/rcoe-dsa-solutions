class two_crystal_balls {
  public static void main(String[] args) {
    boolean[] breaks = { false, false, false, false, false, false, false, false, false, false, false, false, false,
        false,
        false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,
        false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,
        false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,
        false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true,
        true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true,
        true, true };
    int n = 100;
    int jumpSize = (int) Math.sqrt(n);
    int i;
    for (i = 0; i < n; i += jumpSize) {
      if (breaks[i]) {
        break;
      }
    }
    i -= jumpSize;
    int k;
    for (k = i; k < k + jumpSize; k++) {
      if (breaks[k]) {
        break;
      }
    }
    System.out.println("The first floor where the egg breaks is: " + (k + 1));
  }
}
