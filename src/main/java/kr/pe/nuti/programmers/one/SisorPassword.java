package kr.pe.nuti.programmers.one;

/**
 * 프로그래머스<br>
 * Level 1<br>
 * 시저 암호
 */
public class SisorPassword {
  public String solution(String s, int n) {
    final char blank = " ".charAt(0);
    final char a = "a".charAt(0);
    final char z = "z".charAt(0);
    final char A = "A".charAt(0);
    final char Z = "Z".charAt(0);
    return s.chars()
        .map(i -> {
          int res = i == blank ? i : i + n;
          if (i >= a && i <= z && res > z) {
            res = a + ((res - a) % (z - a)) - 1;
          } else if (i >= A && i <= Z && res > Z) {
            res = A + ((res - A) % (Z - A)) - 1;
          }
          return res;
        })
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
  }
}
