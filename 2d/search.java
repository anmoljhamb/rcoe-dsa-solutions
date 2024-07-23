class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    int row = 0;
    int col = matrix[0].length - 1;

    while (col >= 0 && row < matrix.length) {
      int item = matrix[row][col];
      if (item == target) {
        return true;
      } else if (target < item) {
        col--;
      } else {
        row++;
      }
    }

    return false;
  }
}
