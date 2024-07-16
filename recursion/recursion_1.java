class recursion_1 {
  public static void main(String[] args) {
    int n = 5;
    System.out.println("The factorial is: " + factorial(n));
  }

  public static int factorial(int n) {
    if (n == 0 || n == 1)
      return 1;
    return n * factorial(n - 1);
  }
}
