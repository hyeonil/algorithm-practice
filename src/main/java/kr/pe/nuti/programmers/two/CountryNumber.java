package kr.pe.nuti.programmers.two;

/**
 * 프로그래머스<br>
 * Level 2<br>
 * 124 나라의 숫자
 */
public class CountryNumber {
  public String solution(int n) {
    final String[] nums = {"1", "2", "4"};
    int num = n;
    StringBuilder sb = new StringBuilder();
    while(num > 0) {
      sb.insert(0, nums[(num - 1) % 3]);
      num = (num - 1) / 3;
    }
    return sb.toString();
  }
}
