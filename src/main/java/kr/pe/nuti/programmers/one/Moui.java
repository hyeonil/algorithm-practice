package kr.pe.nuti.programmers.one;

import java.util.ArrayList;
import java.util.List;

/**
 * 프로그래머스<br>
 * Level 1<br>
 * 모의고사
 */
public class Moui {
  public int[] solution(int[] answers) {
    int[] pattern1 = {1, 2, 3, 4, 5};
    int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    int[] correctCounts = {0, 0, 0};

    int[] answer;
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < answers.length; i++) {
      int correct = answers[i];
      correctCounts[0] += (correct == pattern1[i % pattern1.length]) ? 1 : 0;
      correctCounts[1] += (correct == pattern2[i % pattern2.length]) ? 1 : 0;
      correctCounts[2] += (correct == pattern3[i % pattern3.length]) ? 1 : 0;
    }

    int max = 0;

    for (int i = 0; i < correctCounts.length; i++) {
      int correctCount = correctCounts[i];
      if (correctCount > max) {
        max = correctCount;
        list.clear();
        list.add(i + 1);
      } else if (correctCount == max) {
        list.add(i + 1);
      }
    }

    answer = list.stream().mapToInt(i->i).toArray();

    return answer;
  }
}
