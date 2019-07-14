package kr.pe.nuti.programmers.one

import spock.lang.Specification

class GymClothesSpec extends Specification {
  GymClothes app

  def setup() {
    app = new GymClothes()
  }

  def "test"() {
    expect:
    app.solution(n, lost as int[], reserve as int[]) == result

    where:
    n | lost | reserve | result
    5 | [2, 4] | [1, 3, 5] | 5
    5 | [2, 4] | [3] | 4
    3 | [3] | [1] | 2
  }
}
