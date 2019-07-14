package kr.pe.nuti.programmers.two;

/**
 * 프로그래머스<br>
 * Level 2<br>
 * 큰 수 만들기
 */
public class MakeBigNumber {
  public String solution(String number, int k) {
    StringBuilder sb = new StringBuilder();

    /*for(int i = 0; i < number.length() - k; i++) {
      max = '0';
      for(int j = idx; j <= k + i; j++) {
        if(max < number.charAt(j)) {
          max = number.charAt(j); idx = j + 1;
        }
      }
      sb.append(max);
    }*/
    return sb.toString();
  }
}
