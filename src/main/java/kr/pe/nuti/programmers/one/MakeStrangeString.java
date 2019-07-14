package kr.pe.nuti.programmers.one;

/**
 * 프로그래머스<br>
 * Level 1<br>
 * 이상한 문자 만들기
 */
public class MakeStrangeString {
  public String solution(String s) {
    StringBuilder sb = new StringBuilder();
    char[] chars = s.toCharArray();
    int idx = 0;

    for (char ch : chars) {
      if (ch == ' ') {
        sb.append(ch);
        idx = -1;
      } else if (idx % 2 == 0) {
        sb.append(Character.toUpperCase(ch));
      } else {
        sb.append(Character.toLowerCase(ch));
      }
      idx++;
    }

    return sb.toString();
  }
}
