package kr.pe.nuti.hackerrank.medium;

public class AlmostSorted {
  public int almostSorted(int[] arr) {
    int greater = 0;
    int faultCnt = 0;
    boolean isSwap = false;
    boolean isReverse = false;
    int faultIdx = -1;
    int lastFaultIdx = -1;
    for (int i = 0; i < arr.length - 1; i++) {
      if (faultCnt > 0 && arr[i] > arr[i + 1]) {
        lastFaultIdx = i + 1;
        faultCnt++;
      } else if (arr[i] > arr[i + 1]) {
        greater = arr[i];
        faultCnt++;
        faultIdx = i;
        lastFaultIdx = i;
      }
    }
    if (faultCnt == 1 && arr.length == 2) {
      System.out.println("yes");
      System.out.println("swap 1 2");
    } else if (faultCnt < 2) {
      System.out.println("no");
    } else if (faultCnt == 2) {
      System.out.println("yes");
      System.out.format("swap %d %d", faultIdx + 1, lastFaultIdx + 1);
    } else {
      System.out.println("yes");
      System.out.format("reverse %d %d", faultIdx + 1, lastFaultIdx + 1);
    }
    return 1;
  }
}
