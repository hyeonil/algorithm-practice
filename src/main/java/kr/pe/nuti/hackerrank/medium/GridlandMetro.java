package kr.pe.nuti.hackerrank.medium;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GridlandMetro {
  public BigInteger gridlandMetro(int n, int m, int k, int[][] track) {
    BigInteger metro = BigInteger.ZERO;
    BigInteger N = BigInteger.valueOf(n);
    BigInteger M = BigInteger.valueOf(m);
    Map<Integer, List<int[]>> map = Arrays.stream(track)
        .sorted((arr1, arr2) -> arr1[0] - arr2[0] == 0 ? arr1[1] - arr2[1] : arr1[0] - arr2[0])
        .collect(Collectors.toMap(
            arr -> arr[0],
            Arrays::asList,
            (a, b) -> Stream.of(a, b)
                .flatMap(Collection::stream)
                .sorted((arr1, arr2) -> arr1[0] - arr2[0] == 0 ? arr1[1] - arr2[1] : arr1[0] - arr2[0])
                .collect(Collectors.toList())
        ));
    Set<Integer> keySet = map.keySet();

    for (Integer key : keySet) {
      List<int[]> origin = map.get(key);
      List<int[]> result = new ArrayList<>();
      int[] prev = new int[3];

      for (int[] range : origin) {
        if (range[1] > prev[2]) {
          result.add(range);
          prev = range;
        } else if (range[2] > prev[2]) {
          prev[2] = range[2];
        }
      }
      map.put(key, result);
      for (int[] range : result) {
        metro = metro.add(BigInteger.valueOf(range[2] - range[1] + 1));
      }
    }

    return N.multiply(M).subtract(metro);
  }
}
