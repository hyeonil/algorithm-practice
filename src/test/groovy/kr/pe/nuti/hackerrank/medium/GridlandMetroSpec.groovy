package kr.pe.nuti.hackerrank.medium

import spock.lang.Specification

class GridlandMetroSpec extends Specification {
  GridlandMetro app

  void setup() {
    app = new GridlandMetro()
  }

  def "GridlandMetro"() {
    expect:
    app.gridlandMetro(n, m, k, track as int[][]) == result

    where:
    n | m | k | track | result
    1 | 5 | 3 | [[1, 1, 2], [1, 2, 4], [1, 3, 5]] | 0
    1 | 5 | 3 | [[1, 1, 3], [1, 2, 3], [1, 3, 5]] | 0
  }
}
