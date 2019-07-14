package kr.pe.nuti.programmers.two

import spock.lang.Specification

class MakeBigNumberSpec extends Specification {
  MakeBigNumber app

  void setup() {
    app = new MakeBigNumber()
  }

  def "Solution"() {
    expect:
    app.solution(number, k) == result

    where:
    number | k | result
    "1924" | 2 | "94"
    "1231234" | 3 | "3234"
    "4177252841" |4 | "775841"
  }
}
