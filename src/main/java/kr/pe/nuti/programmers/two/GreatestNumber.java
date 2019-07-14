package kr.pe.nuti.programmers.two;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 프로그래머스<br>
 * Level 2<br>
 * 가장 큰 수
 */
public class GreatestNumber {
  public String solution(int[] numbers) {
    String str = Arrays.stream(numbers)
        .boxed()
        .map(String::valueOf)
        .sorted((a, b) -> (b + a).compareTo(a + b))
        .collect(Collectors.joining());
    return str.replaceAll("0", "").equals("") ? "0" : str;
  }
}
