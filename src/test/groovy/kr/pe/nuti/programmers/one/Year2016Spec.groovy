package kr.pe.nuti.programmers.one

import spock.lang.Specification

class Year2016Spec extends Specification {
  Year2016 app

  def setup() {
    app = new Year2016()
  }

  def test() {
    expect:
    app.solution(a, b) == result

    where:
    a | b | result
    1 | 1 | "FRI"
    5 | 24 | "TUE"
  }
}
