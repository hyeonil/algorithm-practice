package kr.pe.nuti.programmers.one;

import java.util.Arrays;

/**
 * 프로그래머스<br>
 * Level 1<br>
 * 서울에서 김서방 찾기
 */
public class FindKim {
  public String solution(String[] seoul) {
    int idx = Arrays.asList(seoul).indexOf("Kim");
    return "김서방은 " + idx + "에 있다";
  }
}
