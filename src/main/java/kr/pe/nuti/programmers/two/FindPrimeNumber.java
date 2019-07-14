package kr.pe.nuti.programmers.two;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 프로그래머스<br>
 * Level 2<br>
 * 소수 찾기
 */
public class FindPrimeNumber {
  public int solution(String numbers) {
    int count = 0;
    char[] chars = numbers.toCharArray();
    Arrays.sort(chars);
    String maxStr = new StringBuilder(new String(chars)).reverse().toString();
    int max = Integer.parseInt(maxStr);
    int[] notPrimes = new int[max + 1];
    notPrimes[0] = 1;
    notPrimes[1] = 1;

    for (int i = 2; i <= max; i++) {
      for (int j = 2; i * j <= max; j++) {
        notPrimes[i * j] = 1;
      }
    }
    Set<Integer> numberSet = new HashSet<>();
    for (int i = 1; i <= chars.length; i++) {
      perm(chars, 0, i, numberSet);
    }
    for (int number : numberSet) {
      if (notPrimes[number] == 0) count++;
    }

    return count;
  }

  public void perm(char[] arr, int depth, int k, Set<Integer> numberSet) {
    if (depth == k) {
      String num = String.valueOf(arr, 0, k);
      numberSet.add(Integer.valueOf(num));
      return;
    } else {
      for (int i = depth; i < arr.length; i++) {
        swap(arr, i, depth);
        perm(arr, depth + 1, k, numberSet);
        swap(arr, i, depth);
      }
    }
  }

  public void swap(char[] arr, int i, int j) {
    char temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
