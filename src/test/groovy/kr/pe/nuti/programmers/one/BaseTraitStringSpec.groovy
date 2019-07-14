package kr.pe.nuti.programmers.one

import spock.lang.Specification

class BaseTraitStringSpec extends Specification {
  BaseTraitString app

  def setup() {
    app = new BaseTraitString()
  }

  def test() {
    expect:
    app.solution(s) == result

    where:
    s | result
    "a234" | false
    "1234" | true
  }
}
