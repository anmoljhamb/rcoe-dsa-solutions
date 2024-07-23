public class toh {
  public static void main(String[] args) {
    int n = 3;
    tower_of_hanoi(n, "A", "B", "C");
  }

  static void tower_of_hanoi(int n, String src, String helper, String dest) {
    if (n == 0) {
      return;
    }
    tower_of_hanoi(n - 1, src, dest, helper);
    System.out.println("Moving disk " + n + " from " + src + " to " + dest);
    tower_of_hanoi(n - 1, helper, src, dest);
  }
}
