package kr.pe.nuti.programmers.two;

/**
 * 프로그래머스<br>
 * Level 2<br>
 * 주식가격
 */
public class StockPrice {
  public int[] solution(int[] prices) {
    int[] seconds = new int[prices.length];

    for (int i = 0; i < prices.length; i++) {
      int second = prices.length - 1;
      for (int j = i + 1; j < prices.length; j++) {
        if (prices[i] > prices[j]) {
          second = j;
          break;
        }
      }
      seconds[i] = second - i;
    }
    return seconds;
  }
}
