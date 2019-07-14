package kr.pe.nuti.programmers.two

import spock.lang.Specification

class HIndexSpec extends Specification {
  HIndex app

  void setup() {
    app = new HIndex()
  }

  def "Solution"() {
    expect:
    app.solution(citations as int[]) == result

    where:
    citations | result
    [3, 0, 6, 1, 5] | 3
  }
}
