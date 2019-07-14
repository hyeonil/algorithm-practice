package kr.pe.nuti.programmers.two;

/**
 * 프로그래머스<br>
 * Level 2<br>
 * 스킬트리
 */
public class SkillTree {
  public int solution(String skill, String[] skillTrees) {
    int answer = 0;
    String[] skills = new StringBuilder(skill).reverse().toString().split("");

    for (String skillTree : skillTrees) {
      int[] seqs = new int[skills.length];
      boolean accepted = true;
      for (int i = 0; i < skills.length; i++) {
        String s = skills[i];
        seqs[i] = skillTree.indexOf(s);

        if (i > 0 && seqs[i] < 0) {
          for (int j = 0; j < i; j++) {
            if (seqs[j] >= 0) {
              accepted = false;
              break;
            }
          }
        } else {
          for (int j = 0; j < i; j++) {
            if (seqs[j] >= 0 && seqs[j] < seqs[i]) {
              accepted = false;
              break;
            }
          }
        }
        if (!accepted) break;
      }

      if (accepted) answer++;
    }

    return answer;
  }
}
