package kr.pe.nuti.programmers.one;

/**
 * 프로그래머스<br>
 * Level 1<br>
 * 문자열 다루기 기본
 */
public class BaseTraitString {
  public boolean solution(String s) {
    return s.matches("[0-9]{4}|[0-9]{6}");
  }
}
