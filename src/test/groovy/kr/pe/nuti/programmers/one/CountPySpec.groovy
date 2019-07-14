package kr.pe.nuti.programmers.one

import spock.lang.Specification

class CountPySpec extends Specification {
  CountPy app

  def setup() {
    app = new CountPy()
  }

  def test() {
    expect:
    app.solution(s) == result

    where:
    s | result
    "pPoooyY" | true
    "Pyy" | false

  }
}
