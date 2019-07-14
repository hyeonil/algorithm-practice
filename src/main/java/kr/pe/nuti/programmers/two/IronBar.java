package kr.pe.nuti.programmers.two;

import java.util.ArrayList;

/**
 * 프로그래머스<br>
 * Level 2<br>
 * 쇠막대기
 */
public class IronBar {
  public int solution(String arrangement) {
    int answer = 0;
    /*String copyArray = arrangement.replace("()", "0");

    ArrayList<Character> copy = new ArrayList<Character>();

    for(int i = 0; i < copyArray.length(); i++){ copy.add(copyArray.charAt(i)); }

    ArrayList<Character> stack = new ArrayList<Character>();

    for(int i = 0; i < copy.size(); i++){
      if(copy.get(i) == '('){
        stack.add(copy.get(i));
      }else if(copy.get(i) == ')'){
        stack.remove(stack.size()-1);
        answer += 1;
      }else if(copy.get(i) == '0'){
        answer += stack.size();
      }
    }*/
    return 0;
  }
}
