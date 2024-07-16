class recursion_1 {
  public static void main(String[] args) {
    int n = 5;
    // System.out.println("The factorial is: " + factorial(n));
    // print(n);
    // System.out.println("The value of 2^3: " + pow(2, 3));
    int[] arr = { 7, 6, 5, 4 };
    printArr(arr);
    reversePrintArr(arr, 0);
  }

  public static int factorial(int n) {
    if (n == 0 || n == 1)
      return 1;
    return n * factorial(n - 1);
  }

  public static void print(int n) {
    if (n == 0) {
      return;
    }
    System.out.println(n);
    print(n - 1);
    System.out.println(n);
  }

  public static int pow(int a, int b) {
    if (b == 0)
      return 1;
    return a * pow(a, b - 1);
  }

  public static void printArr(int[] arr, int startIndex) {
    if (startIndex == arr.length) {
      return;
    }
    System.out.println(arr[startIndex]);
    printArr(arr, startIndex + 1);
  }

  public static void reversePrintArr(int[] arr, int startIndex) {
    if (startIndex == arr.length) {
      return;
    }
    printArr(arr, startIndex + 1);
    System.out.println(arr[startIndex]);
  }

  public static void printArr(int[] arr) {
    printArr(arr, 0);
  }
}
