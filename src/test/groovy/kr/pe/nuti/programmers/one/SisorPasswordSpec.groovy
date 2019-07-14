package kr.pe.nuti.programmers.one

import spock.lang.Specification

class SisorPasswordSpec extends Specification {
  SisorPassword app

  def setup() {
    app = new SisorPassword()
  }

  def test() {
    expect:
    app.solution(s, n) == result

    where:
    s | n | result
    "AB" | 1 | "BC"
    "z" | 1 | "a"
    "a B z" | 4 | "e F d"
  }
}
