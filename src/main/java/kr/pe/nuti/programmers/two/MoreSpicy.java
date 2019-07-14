package kr.pe.nuti.programmers.two;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 프로그래머스<br>
 * Level 2<br>
 * 더 맵게
 */
public class MoreSpicy {
  public int solution(int[] scoville, final int k) {
    int count = 0;
    Queue<Integer> queue = new PriorityQueue<>(Arrays.stream(scoville).filter(i -> i < k).boxed().collect(Collectors.toList()));

    while (queue.size() > 1 && queue.peek() < k) {
      int min = queue.poll();
      int second = queue.poll();

      queue.offer(min + (second * 2));
      count++;
    }

    if (queue.peek() < k) {
      count = -1;
    }

    return count;
  }
}
