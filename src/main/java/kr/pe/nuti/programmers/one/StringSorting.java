package kr.pe.nuti.programmers.one;

import java.util.Arrays;

/**
 * 프로그래머스<br>
 * Level 1<br>
 * 문자열 내 마음대로 정렬하기
 */
public class StringSorting {
  public String[] solution(String[] strings, int n) {
    return Arrays.stream(strings)
        .sorted((a, b) -> a.charAt(n) == b.charAt(n) ? a.compareTo(b) : a.substring(n).compareTo(b.substring(n)))
        .toArray(String[]::new);
  }
}
