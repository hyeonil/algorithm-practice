package kr.pe.nuti.programmers.one

import spock.lang.Specification

class IntegerSumSpec extends Specification {
  IntegerSum app

  def setup() {
    app = new IntegerSum()
  }

  def test() {
    expect:
    app.solution(a, b) == result

    where:
    a | b | result
    3 | 5 | 12
    3 | 3 | 3
    5 | 3 | 12
  }
}
