package kr.pe.nuti.programmers.one;

import java.util.stream.LongStream;

/**
 * 프로그래머스<br>
 * Level 1<br>
 * 두 정수 사이의 합
 */
public class IntegerSum {
  public long solution(int a, int b) {
    return LongStream.range(Math.min(a, b), Math.max(a, b) + 1L).sum();
  }
}
