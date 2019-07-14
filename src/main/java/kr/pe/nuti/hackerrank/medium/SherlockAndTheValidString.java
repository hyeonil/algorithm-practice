package kr.pe.nuti.hackerrank.medium;

import java.util.Arrays;

public class SherlockAndTheValidString {
  public String isValid(String s) {
    char a = 'a';
    char z = 'z';
    int[] cntArr = new int[z - a + 1];
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      cntArr[chars[i] - a]++;
    }
    int[] distinctArr = Arrays.stream(cntArr).filter(i -> i > 0).distinct().toArray();
    if (distinctArr.length == 1) {
      return "YES";
    } else if (distinctArr.length == 2) {
      final int max = Math.max(distinctArr[0], distinctArr[1]);
      final int min = Math.min(distinctArr[0], distinctArr[1]);
      if (min == 1) {
        long cnt = Arrays.stream(cntArr).filter(i -> i == min).count();
        if (cnt == 1) {
          return "YES";
        }
      } else if (max - min == 1) {
        long cnt = Arrays.stream(cntArr).filter(i -> i == max).count();
        if (cnt == 1) {
          return "YES";
        }
      }
    }

    return "NO";
  }
}
