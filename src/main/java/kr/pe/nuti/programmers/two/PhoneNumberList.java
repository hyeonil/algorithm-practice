package kr.pe.nuti.programmers.two;

import java.util.Arrays;

/**
 * 프로그래머스<br>
 * Level 2<br>
 * 전화번호 목록
 */
public class PhoneNumberList {
  public boolean solution(String[] phoneBook) {
    boolean hasPrefix = true;
    Arrays.sort(phoneBook);

    for (int i = 0; i < phoneBook.length; i++) {
      for (int j= i + 1; j < phoneBook.length; j++) {
        hasPrefix = phoneBook[i].startsWith(phoneBook[j]) || phoneBook[j].startsWith(phoneBook[i]);
        if (hasPrefix) break;
      }
      if (hasPrefix) break;
    }

    return !hasPrefix;
  }
}
