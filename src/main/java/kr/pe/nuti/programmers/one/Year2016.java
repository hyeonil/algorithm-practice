package kr.pe.nuti.programmers.one;

/**
 * 프로그래머스<br>
 * Level 1<br>
 * 2016년
 */
public class Year2016 {
  public String solution(int a, int b) {
    final String[] dayOfWeeks = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    final int [] dayOfMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String answer;
    int days = 0;

    for (int i = 0; i < a - 1; i++) {
      days += dayOfMonth[i];
    }
    days += b;

    int dayOfWeek = (days + 4) % 7;
    answer = dayOfWeeks[dayOfWeek];

    return answer;
  }
}
