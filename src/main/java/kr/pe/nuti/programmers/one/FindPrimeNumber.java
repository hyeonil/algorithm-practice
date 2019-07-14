package kr.pe.nuti.programmers.one;

import java.util.Arrays;

/**
 * 프로그래머스<br>
 * Level 1<br>
 * 소수 찾기
 */
public class FindPrimeNumber {
  public int solution(int n) {
    int[] notPrimes = new int[n + 1];
    notPrimes[0] = 1;
    notPrimes[1] = 1;

    for (int i = 2; i <= n; i++) {
      for (int j = 2; i * j <= n; j++) {
        notPrimes[i * j] = 1;
      }
    }

    return (int) Arrays.stream(notPrimes).filter(i -> i != 1).count();
  }
}
