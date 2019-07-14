package kr.pe.nuti.programmers.two

import spock.lang.Specification

class SkillTreeSpec extends Specification {
  SkillTree app

  def setup() {
    app = new SkillTree()
  }

  def test() {
    expect:
    app.solution(skill, skillTrees as String[]) == result

    where:
    skill | skillTrees | result
    "CBD" | ["BACDE", "CBADF", "AECB", "BDA"] | 2
  }
}
