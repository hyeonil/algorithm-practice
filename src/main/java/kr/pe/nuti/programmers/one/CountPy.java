package kr.pe.nuti.programmers.one;

/**
 * 프로그래머스<br>
 * Level 1<br>
 * 문자열 내 p와 y의 개수
 */
public class CountPy {
  boolean solution(String s) {
    return s.toLowerCase().replaceAll("p", "").length() == s.toLowerCase().replaceAll("y", "").length();
  }
}
