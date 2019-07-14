package kr.pe.nuti.programmers.two

import spock.lang.Specification

class CountryNumberSpec extends Specification {
  CountryNumber app

  def setup() {
    app = new CountryNumber()
  }

  def "Solution"() {
    expect:
    app.solution(n) == result

    where:
    n | result
    1 | "1"
    2 | "2"
    3 | "4"
    4 | "11"
    5 | "12"
    6 | "14"
    7 | "21"
    8 | "22"
    9 | "24"
    10 | "41"
    11 | "42"
    12 | "44"
    13 | "111"
  }
}
