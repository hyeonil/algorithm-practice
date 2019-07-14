package kr.pe.nuti.hackerrank.medium;

public class EmasSuperComputer {
  public int twoPluses(String[] grid) {
    char[][] chars = new char[grid.length][grid[0].length()];
    boolean[][] used = new boolean[grid.length][grid[0].length()];
    for (int i = 0; i < grid.length; i++) {
      chars[i] = grid[i].toCharArray();
    }
    int tot = 1;

    for (int i = 1; i < chars.length - 1; i++) {
      for (int j = 1; j < chars[i].length; j++) {
        if (chars[i][j] == 'G') {
          int top = 0;
          int bottom = 0;
          int left = 0;
          int right = 0;
          for (int n = i - 1; n >= 0 && chars[n][j] == 'G' && !used[n][j]; n--) {
            top++;
          }
          for (int n = i + 1; n < chars.length && chars[n][j] == 'G' && !used[n][j]; n++) {
            bottom++;
          }
          for (int n = j - 1; n >= 0 && chars[i][n] == 'G' && !used[i][n]; n--) {
            left++;
          }
          for (int n = j + 1; n < chars[i].length && chars[i][n] == 'G' && !used[i][n]; n++) {
            right++;
          }

          int min = Math.min(top, bottom);
          min = Math.min(min, left);
          min = Math.min(min, right);
          if (min > 0) {
            for (int n = i; n >= i - min; n--) {
              used[n][j] = true;
            }
            for (int n = i; n <= i + min; n++) {
              used[n][j] = true;
            }
            for (int n = j; n >= j - min; n--) {
              used[i][n] = true;
            }
            for (int n = j; n <= j + min; n++) {
              used[i][n] = true;
            }
            tot *= ((min * 4) + 1);
          }
        }
      }
    }
    return tot;
  }
}
