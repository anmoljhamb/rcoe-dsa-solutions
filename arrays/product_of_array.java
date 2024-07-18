class product_of_array {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    print(arr);
    result(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ", ");
    }
    System.out.println();
  }

  public static int[] result(int[] arr) {
    int[] left = new int[arr.length];
    int[] right = new int[arr.length];
    int[] result = new int[arr.length];

    left[0] = arr[0];

    for (int i = 1; i < arr.length; i++) {
      left[i] = arr[i] * left[i - 1];
    }

    System.out.println("Left: ");
    print(left);

    right[arr.length - 1] = arr[arr.length - 1];

    for (int i = arr.length - 2; i >= 0; i--) {
      right[i] = arr[i] * right[i + 1];
    }

    System.out.println("Right: ");
    print(right);

    for (int i = 0; i < arr.length; i++) {
      int l;
      if (i == 0) {
        l = 1;
      } else {
        l = left[i - 1];
      }
      int r;

      if (i == arr.length - 1) {
        r = 1;
      } else {
        r = right[i + 1];
      }
      result[i] = l * r;
    }

    print(result);

    return result;
  }
}
