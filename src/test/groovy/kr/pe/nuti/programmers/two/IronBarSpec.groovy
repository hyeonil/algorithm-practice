package kr.pe.nuti.programmers.two

import spock.lang.Specification

class IronBarSpec extends Specification {
  IronBar app

  void setup() {
    app = new IronBar()
  }

  def "Solution"() {
    expect:
    app.solution(arrangement) == result

    where:
    arrangement | result
    "()(((()())(())()))(())" | 17
  }
}
