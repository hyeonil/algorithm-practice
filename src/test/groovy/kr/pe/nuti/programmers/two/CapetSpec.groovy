package kr.pe.nuti.programmers.two

import spock.lang.Specification

class CapetSpec extends Specification {
  Capet app

  void setup() {
    app = new Capet()
  }

  def "Solution"() {
    expect:
    app.solution(brown, red) == result as int[]

    where:
    brown | red | result
    10 | 2 | [4, 3]
    8 | 1 | [3, 3]
    24 | 24 | [8, 6]
    12 | 4 | [4, 4]
    28 | 20 | [12, 4]
  }
}