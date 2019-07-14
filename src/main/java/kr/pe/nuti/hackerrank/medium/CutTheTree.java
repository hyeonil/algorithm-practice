package kr.pe.nuti.hackerrank.medium;

import java.util.*;
import java.util.stream.Collectors;

public class CutTheTree {
  public static int cutTheTree2(List<Integer> data, List<List<Integer>> edges) {
    Map<Integer, List<Integer>> map = edges.stream().collect(Collectors.toMap(
        l -> l.get(0),
        l -> {
          List<Integer> li = new ArrayList<>();
          li.add(l.get(1));
          return li;
        },
        (a, b) -> {
          a.addAll(b);
          return a;
        }
    ));
    Queue<Integer> queue = new PriorityQueue<>();
    queue.poll();
    return 0;
  }

  public static int cutTheTree(List<Integer> data, List<List<Integer>> edges) {
    Map<Integer, List<Integer>> map = new HashMap<>();

    for (int i = 0; i < edges.size(); i++) {
      List<Integer> edge = edges.get(i);
      int x = edge.get(0);
      int y = edge.get(1);
      List<Integer> list = map.getOrDefault(x, new ArrayList<>());
      list.add(y);
      map.put(x, list);
      list = map.getOrDefault(y, new ArrayList<>());
      list.add(x);
      map.put(y, list);
    }

    int min = Integer.MAX_VALUE;
    Queue<Integer> queue = new ArrayDeque<>();
    Map<Integer, Integer> visitedMap = new HashMap<>();
    for (int i = 0; i < edges.size(); i++) {
      List<Integer> edge = edges.get(i);
      int node1 = edge.get(0);
      int node2 = edge.get(1);
      int sum1 = 0;
      int sum2 = 0;
      queue.clear();
      visitedMap.clear();
      queue.add(node1);
      visitedMap.put(node1, 1);
      while (!queue.isEmpty()) {
        int node = queue.poll();
        int val = data.get(node - 1);
        sum1 += val;
        List<Integer> nextNodes = map.getOrDefault(node, new ArrayList<>());
        for (int nextNode : nextNodes) {
          if (nextNode != node2 && visitedMap.getOrDefault(nextNode, 0) == 0) {
            queue.add(nextNode);
            visitedMap.put(nextNode, 1);
          }
        }
      }

      visitedMap.clear();
      visitedMap.put(node2, 1);
      queue.add(node2);
      while (!queue.isEmpty()) {
        int node = queue.poll();
        int val = data.get(node - 1);
        sum2 += val;
        List<Integer> nextNodes = map.getOrDefault(node, new ArrayList<>());
        for (int nextNode : nextNodes) {
          if (nextNode != node1 && visitedMap.getOrDefault(nextNode, 0) == 0) {
            queue.add(nextNode);
            visitedMap.put(nextNode, 1);
          }
        }
      }

      int diff = Math.abs(sum1 - sum2);
      System.out.println(sum1 + ", " + sum2 + ": " + diff);
      if (diff < min) {
        min = diff;
      }
      System.out.println();
    }

    return min;
  }
}
