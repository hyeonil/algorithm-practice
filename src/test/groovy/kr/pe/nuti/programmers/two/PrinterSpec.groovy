package kr.pe.nuti.programmers.two

import spock.lang.Specification

class PrinterSpec extends Specification {
  Printer app

  void setup() {
    app = new Printer()
  }

  def "Solution"() {
    expect:
    app.solution(priorities as int[], location) == result

    where:
    priorities | location | result
    [2, 1, 3, 2] | 2 | 1
    [1, 1, 9, 1, 1, 1] | 0 | 5
    [1, 1, 9, 1, 2, 1] | 0 | 4
  }
}
