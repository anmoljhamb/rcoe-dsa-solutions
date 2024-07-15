class find_odd_one_out {
  public static void main(String[] args) {
    int arr[] = { 1, 1, 2, 1, 1, 1, 1, 1 };
    int n = 8;

    int group1 = arr[0] + arr[1] + arr[2];
    int group2 = arr[3] + arr[4] + arr[5];

    int ans;

    // first comparison
    if (group1 == group2) {
      // second comparison
      // condition one. Where group1 == group2, means we can discard both of them
      if (arr[6] > arr[7]) {
        ans = 6;
      } else {
        ans = 7;
      }
    } else {
      // means that one of the groups has the imposter.
      if (group1 > group2) {
        // discard group2
        if (arr[0] == arr[1]) {
          ans = 2;
        } else {
          if (arr[0] > arr[1]) {
            ans = 0;
          } else {
            ans = 1;
          }
        }
      } else {
        if (arr[3] == arr[4]) {
          ans = 5;
        } else {
          if (arr[3] > arr[4]) {
            ans = 3;
          } else {
            ans = 4;
          }
        }
        // discard group1
      }
    }
    System.out.println("The odd one out is at index: " + ans);
  }
}
