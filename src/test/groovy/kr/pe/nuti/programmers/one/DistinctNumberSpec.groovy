package kr.pe.nuti.programmers.one

import spock.lang.Specification

class DistinctNumberSpec extends Specification {
  DistinctNumber app

  def setup() {
    app = new DistinctNumber()
  }

  def test() {
    expect:
    app.solution(arr as int[]) == result as int[]

    where:
    arr | result
    [1,1,3,3,0,1,1] | [1,3,0,1]
    [4,4,4,3,3] | [4,3]
  }
}
