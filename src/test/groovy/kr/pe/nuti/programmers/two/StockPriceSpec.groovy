package kr.pe.nuti.programmers.two

import spock.lang.Specification

class StockPriceSpec extends Specification {
  StockPrice app

  void setup() {
    app = new StockPrice()
  }

  def "Solution"() {
    expect:
    app.solution(prices as int[]) == result as int[]

    where:
    prices | result
    [1, 2, 3, 2, 3] | [4, 3, 1, 1, 0]
  }
}
