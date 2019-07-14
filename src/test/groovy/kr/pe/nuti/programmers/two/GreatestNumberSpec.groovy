package kr.pe.nuti.programmers.two

import spock.lang.Specification

class GreatestNumberSpec extends Specification {
  GreatestNumber app

  void setup() {
    app = new GreatestNumber()
  }

  def "Solution"() {
    expect:
    app.solution(numbers as int[]) == result

    where:
    numbers | result
    [6, 10, 2] | "6210"
    [3, 30, 34, 5, 9] | "9534330"
  }
}
