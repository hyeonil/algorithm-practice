package kr.pe.nuti.hackerrank.medium;

public class Encryption {
  // Complete the encryption function below.
  public String encryption(String s) {
    String noneSpace = s.replaceAll(" ", "");
    StringBuilder sb = new StringBuilder();
    double sqrt = Math.sqrt(noneSpace.length());
    int rows = (int) Math.floor(sqrt);
    int cols = sqrt - rows == 0 ? rows : rows + 1;
    if (rows * cols < noneSpace.length()) {
      rows++;
    }

    for (int i = 0; i < cols; i++) {
      char[] chars = new char[rows];
      int j;
      for (j = 0; j < rows; j++) {
        int loc = j * cols + i;
        if (loc >= noneSpace.length()) {
          break;
        }
        chars[j] = noneSpace.charAt(loc);
      }
      sb.append(" ").append(chars, 0, j);
    }

    return sb.toString().replaceFirst(" ", "");
  }
}
