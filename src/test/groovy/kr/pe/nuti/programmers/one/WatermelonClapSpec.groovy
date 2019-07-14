package kr.pe.nuti.programmers.one

import spock.lang.Specification

class WatermelonClapSpec extends Specification {
  WatermelonClap app

  def setup() {
    app = new WatermelonClap()
  }

  def test() {
    expect:
    app.solution(n) == result

    where:
    n | result
    3 | "수박수"
    4 | "수박수박"
  }
}
