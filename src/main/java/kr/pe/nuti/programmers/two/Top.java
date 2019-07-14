package kr.pe.nuti.programmers.two;

/**
 * 프로그래머스<br>
 * Level 2<br>
 * 탑
 */
public class Top {
  public int[] solution(int[] heights) {
    int[] answer = new int[heights.length];

    for (int i = 0; i < heights.length; i++) {
      for (int j = i - 1; j >= 0; j--) {
        if (heights[j] > heights[i]) {
          answer[i] = j + 1;
          break;
        }
      }
    }

    return answer;
  }
}
