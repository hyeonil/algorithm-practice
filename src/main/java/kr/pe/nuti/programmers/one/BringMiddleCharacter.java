package kr.pe.nuti.programmers.one;

/**
 * 프로그래머스<br>
 * Level 1<br>
 * 가운데 글자 가져오기
 */
public class BringMiddleCharacter {
  public String solution(String s) {
    String answer;
    int length = s.length();
    int sl = length % 2 == 0 ? 2 : 1;
    int beginIndex = length % 2 == 0 ? (length / 2) - 1 : length / 2;
    int endIndex = beginIndex + sl;
    answer = s.substring(beginIndex, endIndex);
    return answer;
  }
}
