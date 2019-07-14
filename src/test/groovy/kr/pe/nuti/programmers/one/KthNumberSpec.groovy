package kr.pe.nuti.programmers.one

import spock.lang.Specification

class KthNumberSpec extends Specification {
  KthNumber app

  def setup() {
    app = new KthNumber()
  }

  def "test"() {
    expect:
    app.solution(array as int [], commands as int [][]) == result as int[]

    where:
    array | commands | result
    [1, 5, 2, 6, 3, 7, 4] | [[2, 5, 3], [4, 4, 1], [1, 7, 3]] | [5, 6, 3]
  }
}
