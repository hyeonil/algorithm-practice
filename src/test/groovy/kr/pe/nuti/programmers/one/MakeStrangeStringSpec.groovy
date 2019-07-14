package kr.pe.nuti.programmers.one

import spock.lang.Specification

class MakeStrangeStringSpec extends Specification {
  MakeStrangeString app

  def setup() {
    app = new MakeStrangeString()
  }

  def test() {
    expect:
    app.solution(s) == result

    where:
    s | result
    "try hello world" | "TrY HeLlO WoRlD"
    "try  hello w world" | "TrY  HeLlO W WoRlD"
  }
}
