package kr.pe.nuti.programmers.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 프로그래머스<br>
 * Level 2<br>
 * 프린터
 */
public class Printer {
  public int solution(int[] priorities, int location) {
    List<String> locationList = new ArrayList<>();
    List<Integer> priorityList = new ArrayList<>(Arrays.stream(priorities).boxed().collect(Collectors.toList()));
    int seq = 0;
    for (int i = 0; i < priorities.length; i++) {
      locationList.add(String.valueOf(i));
    }

    String printLocation = "";
    String locationString = String.valueOf(location);
    while(!printLocation.equals(locationString)) {
      for (int i = 0; i < priorityList.size(); i++) {
        int currentPriority = priorityList.get(0);
        int printTarget = currentPriority;
        for (int j = 0; j < priorityList.size() - i; j++) {
          int comparingPriority = priorityList.get(j);
          if (comparingPriority > currentPriority) {
            printTarget = comparingPriority;
            locationList.add(locationList.remove(0));
            priorityList.add(priorityList.remove(0));
            break;
          }
        }
        if (printTarget == currentPriority) {
          break;
        }
      }
      printLocation = locationList.remove(0);
      priorityList.remove(0);
      seq++;
    }

    return seq;
  }
}
