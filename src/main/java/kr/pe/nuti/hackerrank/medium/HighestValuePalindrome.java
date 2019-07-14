package kr.pe.nuti.hackerrank.medium;

public class HighestValuePalindrome {
  boolean isPalindrome(String s){
    int i = 0;
    int j = s.length() - 1;

    while(i < j){
      if (s.charAt(i) == s.charAt(j)){
        i++;
        j--;
      } else {
        return false;
      }
    }
    return true;
  }
}
