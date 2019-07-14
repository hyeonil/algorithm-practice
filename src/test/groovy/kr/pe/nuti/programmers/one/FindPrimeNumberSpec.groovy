package kr.pe.nuti.programmers.one

import spock.lang.Specification

class FindPrimeNumberSpec extends Specification {
  FindPrimeNumber app

  def setup() {
    app = new FindPrimeNumber()
  }

  def test() {
    expect:
    app.solution(n) == result

    where:
    n | result
    10 | 4
    5 | 3
  }
}
