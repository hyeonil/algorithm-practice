package kr.pe.nuti.programmers.two;

import java.util.Arrays;

/**
 * 프로그래머스<br>
 * Level 2<br>
 * 조이스틱
 * 오답
 */
public class Joystick {
  public int solution(String name) {
    int count = 0;
    char A = 'A';
    char Z = 'Z';
    int diff = Z - A + 1;
    int middle = diff / 2;
    char[] chars = name.toCharArray();
    final int length = chars.length;
    boolean moveToRight = true;
    int i = 0;
    char[] chs = new char[chars.length];
    Arrays.fill(chs, A);

    while(true) {
      char target = chars[i];

      if (target > A + middle) {
        count += Z - target + 1;
      } else {
        count += target - A;
      }

      chs[i] = target;

      if (Arrays.equals(chars, chs)) {
        break;
      }

      int nextIdx;
      if (moveToRight) {
        nextIdx = i + 1 == length ? 0 : i + 1;
      } else {
        nextIdx = i - 1 < 0 ? length - 1 : i - 1;
      }

      if (chars[nextIdx] == A) {
        int right = 1;
        int left = 1;
        while(chars[i + right >= length ? i + right - length : i + right] == A) {
          right++;
        }

        while(chars[i - left < 0 ? length + i - left : i - left] == A) {
          left++;
        }

        if (right > left) {
          moveToRight = false;
          nextIdx = i - left < 0 ? length + i - left : i - left;
          count += left;
        } else if (right < left) {
          moveToRight = true;
          nextIdx = i - left < 0 ? length + i - left : i - left;
          count += right;
        } else if (!moveToRight) {
          nextIdx = i - left < 0 ? length + i - left : i - left;
          count += left;
        } else {
          nextIdx = i - left < 0 ? length + i - left : i - left;
          count += right;
        }
      } else {
        count++;
      }
      i = nextIdx;
    }

    return count;
  }
}
