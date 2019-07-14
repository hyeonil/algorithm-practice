package kr.pe.nuti.programmers.one;

/**
 * 프로그래머스<br>
 * Level 1<br>
 * 문자열 내림차순으로 배치하기
 */
public class StringDescendingSorting {
  public String solution(String s) {
    return s.codePoints().boxed()
        .sorted((a, b) -> b - a)
        .mapToInt(Integer::intValue)
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
  }
}
