package kr.pe.nuti.programmers.two;

import java.util.Arrays;

/**
 * 프로그래머스<br>
 * Level 2<br>
 * H-Index
 */
public class HIndex {
  public int solution(int[] citations) {
    int hIndex = 0;
    Arrays.sort(citations);
    int max = citations[citations.length - 1];
    for (int i = 0; i <= max; i++) {
      final int citation = i;
      long below = Arrays.stream(citations).filter(n -> n <= citation).count();
      long above = Arrays.stream(citations).filter(n -> n >= citation).count();

      if (below <= citation && above >= citation) {
        hIndex = citation;
      }
    }
    return hIndex;
  }
}
