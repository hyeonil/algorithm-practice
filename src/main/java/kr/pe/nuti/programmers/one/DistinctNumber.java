package kr.pe.nuti.programmers.one;

import java.util.ArrayList;
import java.util.List;

/**
 * 프로그래머스<br>
 * Level 1<br>
 * 같은 숫자는 싫어
 */
public class DistinctNumber {
  public int[] solution(int[] arr) {
    int[] answer;
    int before = -1;
    List<Integer> list = new ArrayList<>();

    for (int num : arr) {
      if (num != before) {
        list.add(num);
        before = num;
      }
    }
    answer = list.stream().mapToInt(Integer::valueOf).toArray();
    return answer;
  }
}
