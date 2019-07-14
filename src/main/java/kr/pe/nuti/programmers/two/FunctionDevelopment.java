package kr.pe.nuti.programmers.two;

import java.util.ArrayList;
import java.util.List;

/**
 * 프로그래머스<br>
 * Level 2<br>
 * 기능개발
 */
public class FunctionDevelopment {
  public int[] solution(int[] progresses, int[] speeds) {
    List<Integer> resultList = new ArrayList<>();
    int deploy = 0;

    while(progresses.length > deploy) {
      for (int i = 0; i < speeds.length; i++) {
        progresses[i] = progresses[i] + speeds[i];
      }
      int before = deploy;
      for (int i = before; i < progresses.length && progresses[i] >= 100; i++) {
        deploy = i + 1;
      }
      if (before != deploy) {
        resultList.add(deploy - before);
      }
    }

    return resultList.stream().mapToInt(Integer::valueOf).toArray();
  }
}
