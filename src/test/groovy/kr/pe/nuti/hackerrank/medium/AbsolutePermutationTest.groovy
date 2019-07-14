package kr.pe.nuti.hackerrank.medium

import spock.lang.Specification

class AbsolutePermutationTest extends Specification {
  AbsolutePermutation app

  void setup() {
    app = new AbsolutePermutation()
  }

  def "AbsolutePermutation"() {
    expect:
    app.absolutePermutation(n, k) == result as int[]

    where:
    n | k | result
    10 | 0 | [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    10 | 1 | [2, 1, 4, 3, 6, 5, 8, 7, 10, 9]
    7 | 0 | [1, 2, 3, 4, 5, 6, 7]
    10 | 9 | [-1]
    9 | 0 | [1, 2, 3, 4, 5, 6, 7, 8, 9]
    10 | 3 | [-1]
    8 | 2 | [3, 4, 1, 2, 7, 8, 5, 6]
    8 | 0 | [1, 2, 3, 4, 5, 6, 7, 8]
    7 | 0 | [1, 2, 3, 4, 5, 6, 7]
    10 | 1 | [2, 1, 4, 3, 6, 5, 8, 7, 10, 9]
  }
}
