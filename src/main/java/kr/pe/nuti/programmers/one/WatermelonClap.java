package kr.pe.nuti.programmers.one;

/**
 * 프로그래머스<br>
 * Level 1<br>
 * 수박수박수박수박수박수?
 */
public class WatermelonClap {
  public String solution(int n) {
    final String word = "수박";
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < n / 2; i++) {
      builder.append(word);
    }
    if (n % 2 != 0) builder.append(word.substring(0, 1));

    return builder.toString();
  }
}
