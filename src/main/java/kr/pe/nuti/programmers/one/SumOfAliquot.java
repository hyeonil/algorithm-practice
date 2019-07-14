package kr.pe.nuti.programmers.one;

import java.util.stream.IntStream;

/**
 * 프로그래머스<br>
 * Level 1<br>
 * 약수의 합
 */
public class SumOfAliquot {
  public int solution(int n) {
    return IntStream.range(1, n + 1).filter(i -> n % i == 0).sum();
  }
}
