import java.util.List;

class Solution {
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> ans = new ArrayList<>();

    int minr = 0;
    int maxr = matrix.length - 1;
    int minc = 0;
    int maxc = matrix[0].length - 1;

    int count = 0;
    int totalElements = matrix.length * matrix[0].length;

    while (count < totalElements) {
      for (int i = minc; i <= maxc && count < totalElements; i++) {
        ans.add(matrix[minr][i]);
        count++;
      }
      minr++;
      for (int i = minr; i <= maxr && count < totalElements; i++) {
        ans.add(matrix[i][maxc]);
        count++;
      }
      maxc--;
      for (int i = maxc; i >= minc && count < totalElements; i--) {
        ans.add(matrix[maxr][i]);
        count++;
      }
      maxr--;
      for (int i = maxr; i >= minr && count < totalElements; i--) {
        ans.add(matrix[i][minc]);
        count++;
      }
      minc++;
    }

    return ans;
  }
}
