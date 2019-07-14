package kr.pe.nuti.programmers.one;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 프로그래머스<br>
 * Level 1<br>
 * K 번째 수
 */
public class KthNumber {
  public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];

    for (int i = 0; i < commands.length; i++) {
      int[] command = commands[i];
      int from = command[0] - 1;
      int to = command[1];
      int idx = command[2] - 1;
      int[] splited = Arrays.copyOfRange(array, from, to);
      int[] splitedAndSorted = IntStream.of(splited).sorted().toArray();
      answer[i] = splitedAndSorted[idx];
    }

    return answer;
  }
}
