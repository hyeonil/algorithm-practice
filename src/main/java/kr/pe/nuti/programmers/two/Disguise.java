package kr.pe.nuti.programmers.two;

import java.util.*;

/**
 * 프로그래머스<br>
 * Level 2<br>
 * 위장
 */
public class Disguise {
  public int solution(String[][] clothes) {
    int count = 1;

    Map<String, List<String>> clothMap = new HashMap<>();
    for(String[] cloth : clothes) {
      List<String> list = clothMap.getOrDefault(cloth[1], new ArrayList<>());
      list.add(cloth[0]);
      clothMap.put(cloth[1], list);
    }

    for (List<String> list : clothMap.values()) {
      count *= (list.size() + 1);
    }

    return count - 1;
  }
}
