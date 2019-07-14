package kr.pe.nuti.programmers.one

import spock.lang.Specification

class FindKimSpec extends Specification {
  FindKim app

  def setup() {
    app = new FindKim()
  }

  def test() {
    expect:
    app.solution(seoul as String[]) == result

    where:
    seoul | result
    ["Jane", "Kim"] | "김서방은 1에 있다"
  }
}
