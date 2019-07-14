package kr.pe.nuti.programmers.one

import spock.lang.Specification

class StringToIntSpec extends Specification {
  StringToInt app

  def setup() {
    app = new StringToInt()
  }

  def test() {
    expect:
    app.solution(s) == result

    where:
    s | result
    "1234" | 1234
    "-1234" | -1234
  }
}
