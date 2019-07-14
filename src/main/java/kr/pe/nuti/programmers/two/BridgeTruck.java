package kr.pe.nuti.programmers.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 프로그래머스<br>
 * Level 2<br>
 * 다리를 지나는 트럭
 */
public class BridgeTruck {
  public int solution(int bridgeLength, int weight, int[] truckWeights) {
    List<Integer> waiting = new ArrayList<>(Arrays.stream(truckWeights).boxed().collect(Collectors.toList()));
    List<Integer> crossing = new ArrayList<>();
    List<Integer> crossingSeconds = new ArrayList<>();
    int seconds = 0;
    while(!waiting.isEmpty() || !crossing.isEmpty()) {
      seconds++;
      boolean isCompletedFirst = crossingSeconds.stream().findFirst().orElse(0) == bridgeLength;
      if (isCompletedFirst) {
        crossing.remove(0);
        crossingSeconds.remove(0);
      }
      crossingSeconds = crossingSeconds.stream().map(i -> i + 1).collect(Collectors.toList());
      int sum = crossing.stream().mapToInt(Integer::valueOf).sum();
      if (!waiting.isEmpty()) {
        int next = waiting.get(0);
        if (sum + next <= weight) {
          waiting.remove(0);
          crossing.add(next);
          crossingSeconds.add(1);
        }
      }
    }
    return seconds;
  }
}
