package kr.pe.nuti.programmers.one

import spock.lang.Specification

class SumOfAliquotSpec extends Specification {
  SumOfAliquot app

  def setup() {
    app = new SumOfAliquot()
  }

  def test() {
    expect:
    app.solution(n) == result

    where:
    n | result
    12 | 28
    5 | 6
  }
}
