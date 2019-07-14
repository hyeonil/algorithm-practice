package kr.pe.nuti.programmers.one;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 프로그래머스<br>
 * Level 1<br>
 * 체육복
 */
public class GymClothes {
  public int solution(int n, int[] lost, int[] reserve) {
    int answer = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 1; i <= n; i++) {
      map.put(i, 1);
    }

    List<Integer> intersection = Arrays.stream(lost).filter(x -> Arrays.stream(reserve).anyMatch(y -> x == y)).boxed().collect(Collectors.toList());
    Set<Integer> intersectionSet = new HashSet<>(intersection);
    Set<Integer> lostSet = new HashSet<>(Arrays.stream(lost).boxed().collect(Collectors.toList()));
    Set<Integer> reserveSet = new HashSet<>(Arrays.stream(reserve).boxed().collect(Collectors.toList()));

    lostSet.removeAll(intersectionSet);
    reserveSet.removeAll(intersectionSet);

    for (Integer r : reserveSet) {
      map.put(r, map.get(r) + 1);
    }

    for (Integer r : lostSet) {
      map.put(r, 0);
      int before = map.getOrDefault(r - 1, 0);
      int after = map.getOrDefault(r + 1, 0);

      if (before > 1) {
        map.put(r, 1);
        map.put(r - 1, 1);
      } else if (after > 1) {
        map.put(r, 1);
        map.put(r + 1, 1);
      }
    }

    answer = map.values().stream().filter(i -> i > 0).map(i -> 1).reduce(0, Integer::sum);

    return answer;
  }
}
