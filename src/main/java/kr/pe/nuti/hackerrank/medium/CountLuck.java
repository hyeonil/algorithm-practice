package kr.pe.nuti.hackerrank.medium;

public class CountLuck {
  public String countLuck(String[] matrix, int k) {
    int y = 0;
    int x = 0;
    int n = matrix.length;
    int m = matrix[0].length();
    char[][] map = new char[n][];
    int wandCount = 0;

    for (int i = 0; i < n; i++) {
      map[i] = matrix[i].toCharArray();
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (map[i][j] == 'M') {
          y = i;
          x = j;
          break;
        }
      }
    }

    goToPortKey(map, y, x, n, m, k);
    for (int i = 0; i < n; i++) {
      System.out.println(new String(map[i]));
      for (int j = 0; j < m; j++) {
        if (map[i][j] == '1') {
          wandCount++;
        }
      }
    }

    System.out.println("wandCount: " + wandCount);
    System.out.println("k: " + k);
    System.out.println("k == wandCount: " + (k == wandCount));

    System.out.println();

    return k == wandCount ? "Impressed" : "Oops!";
  }

  private boolean goToPortKey(char[][] map, int y, int x, int n, int m, int k) {
    if (y >= n || x >= m || x < 0 || y < 0) return false;
    else if (map[y][x] == '*') return true;
    else if (map[y][x] == 'X') return false;
    boolean isCorrect = false;
    isCorrect = isCorrect || goToPortKey(map, y-1, x, n, m, k);
    isCorrect = isCorrect || goToPortKey(map, y+1, x, n, m, k);
    isCorrect = isCorrect || goToPortKey(map, y, x-1, n, m, k);
    isCorrect = isCorrect || goToPortKey(map, y, x+1, n, m, k);

    if (isCorrect) {
      int direction = -1;
      if (x > 0 && (map[y][x - 1] == '.' || map[y][x - 1] == '*')) direction++;
      if (y > 0 && (map[y - 1][x] == '.' || map[y - 1][x] == '*')) direction++;
      if (x < m - 1 && (map[y][x + 1] == '.' || map[y][x + 1] == '*')) direction++;
      if (y < n - 1 && (map[y + 1][x] == '.' || map[y + 1][x] == '*')) direction++;
      if (direction < 0) direction = 0;
      else if (direction > 0) direction = 1;
      map[y][x] = (char) ((int) '0' + direction);
    }

    return isCorrect;
  }
}
