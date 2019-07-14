package kr.pe.nuti.programmers.one

import spock.lang.Specification

class MouiSpec extends Specification {
  Moui app

  def setup() {
    app = new Moui();
  }

  def "test"() {
    expect:
    app.solution(answers as int[]) == result as int[]

    where:
    answers | result
    [1,2,3,4,5] | [1]
    [1,3,2,4,2] | [1,2,3]
  }
}
