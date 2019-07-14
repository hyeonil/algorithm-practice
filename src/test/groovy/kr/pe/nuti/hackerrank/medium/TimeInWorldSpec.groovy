package kr.pe.nuti.hackerrank.medium

import spock.lang.Specification

class TimeInWorldSpec extends Specification {
  TimeInWorld app
  void setup() {
    app = new TimeInWorld()
  }

  def "TimeInWords"() {
    expect:
    app.timeInWords(h, m) == result

    where:
    h | m | result
    1 | 1 | "one minute past one"
  }
}
