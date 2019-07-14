package kr.pe.nuti.programmers.two

import spock.lang.Specification

class MoreSpicySpec extends Specification {
  MoreSpicy app

  void setup() {
    app = new MoreSpicy()
  }

  def "Solution"() {
    expect:
    app.solution(scoville as int[], k) == result

    where:
    scoville | k | result
    [1, 2, 3, 9, 10, 12] | 7 | 2
  }
}
