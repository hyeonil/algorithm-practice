package kr.pe.nuti.programmers.one

import spock.lang.Specification

class DivisionNumberArraySpec extends Specification {
  DivisionNumberArray app

  def setup() {
    app = new DivisionNumberArray()
  }

  def test() {
    expect:
    app.solution(arr as int[], divisor) == result as int[]

    where:
    arr | divisor | result
    [5, 9, 7, 10] | 5 | [5, 10]
    [2, 36, 1, 3] | 1 | [1, 2, 3, 36]
    [3,2,6] | 10 | [-1]
  }
}
