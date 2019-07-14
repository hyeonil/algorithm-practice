package kr.pe.nuti.programmers.two

import spock.lang.Specification

class FindPrimeNumberSpec extends Specification {
  FindPrimeNumber app

  void setup() {
    app = new FindPrimeNumber()
  }

  def "Solution"() {
    expect:
    app.solution(numbers) == result

    where:
    numbers | result
    "17" | 3
    "011" | 2
  }
}
