public class nth_root {
  public static void main(String[] args) {
    int m = 64;
    int n = 3;
    System.out.println(root(m, n));
  }

  static int root(int m, int n) {
    int low = 1;
    int high = m;

    while (low <= high) {
      int mid = (low + high) / 2;
      double temp = Math.pow((double) mid, n);
      if (temp == m) {
        return mid;
      }
      if (temp > m) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return -1;
  }
}
