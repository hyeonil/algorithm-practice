package kr.pe.nuti.hackerrank.medium;

import java.util.ArrayList;
import java.util.List;

public class AbsolutePermutation {
  public int[] absolutePermutation(int n, int k) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int val1 = k + i + 1;
      int val2 = i + 1 - k;
      int val = val1;
      if (val <= n && val2 > 0 && !list.contains(val2)) {
        val = val2;
      } else if (val > n && val2 > 0) {
        val = val2;
      }
      list.add(val);
    }
    int[] arr = list.stream().distinct().filter(i -> i > 0 && i <= n).mapToInt(Integer::valueOf).toArray();
    if (arr.length != n) {
      arr = new int[1];
      arr[0] = -1;
    }

    return arr;
  }
}
