package kr.pe.nuti.programmers.one

import spock.lang.Specification

class StringSortingSpec extends Specification {
  StringSorting app

  def setup() {
    app = new StringSorting()
  }

  def test() {
    expect:
    app.solution(strings as String[], n) == result as String[]

    where:
    strings | n | result
    ["sun", "bed", "car"] | 1 | ["car", "bed", "sun"]
    ["abce", "abcd", "cdx"] | 2 | ["abcd", "abce", "cdx"]
  }
}
