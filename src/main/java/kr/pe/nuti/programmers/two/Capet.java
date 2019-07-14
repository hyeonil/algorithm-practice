package kr.pe.nuti.programmers.two;

/**
 * 프로그래머스<br>
 * Level 2<br>
 * 카펫
 */
public class Capet {
  public int[] solution(int brown, int red) {
    int[] square = new int[2];
    int total = brown + red;

    for (int i = 2; i < total / 2; i++) {
      int div = total / i;
      int rest = total % i;
      int calcBrown = div * 2 + (i - 2) * 2;
      int calcRed = ((div - 2) * (i - 2));
      if (rest == 0 && brown == calcBrown && red == calcRed) {
        square[0] = div;
        square[1] = i;
        break;
      }
    }

    return square;
  }
}
