package kr.pe.nuti.programmers.one;

import java.util.Arrays;

/**
 * 프로그래머스<br>
 * Level 1<br>
 * 나누어 떨어지는 숫자 배열
 */
public class DivisionNumberArray {
  public int[] solution(int[] arr, int divisor) {
    int[] answer = Arrays.stream(arr).filter(i -> i % divisor == 0).sorted().toArray();
    if (answer.length == 0) {
      answer = new int[1];
      answer[0] = -1;
    }
    return answer;
  }
}
