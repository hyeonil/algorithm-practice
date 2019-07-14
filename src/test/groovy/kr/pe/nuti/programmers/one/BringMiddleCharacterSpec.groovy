package kr.pe.nuti.programmers.one

import spock.lang.Specification

class BringMiddleCharacterSpec extends Specification {
  BringMiddleCharacter app

  def setup() {
    app = new BringMiddleCharacter()
  }

  def test() {
    expect:
    app.solution(s) == result

    where:
    s | result
    "abcde" | "c"
    "qwer" | "we"
  }
}
