package kr.pe.nuti.programmers.one;

import java.util.HashMap;
import java.util.Map;

/**
 * 프로그래머스<br>
 * Level 1<br>
 * 완주하지 못한 선수
 */
public class MaratonPlayer {
  public String solution(String[] participant, String[] completion) {
    String answer = "";
    Map<String, Integer> map = new HashMap<>();

    for (String part : participant) {
      map.put(part, map.getOrDefault(part, 0) + 1);
    }
    for (String compl : completion) {
      map.put(compl, map.get(compl) - 1);
    }
    for (String key : map.keySet()) {
      if (map.get(key) > 0) {
        answer = key;
        break;
      }
    }
    return answer;
  }
}
