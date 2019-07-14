package kr.pe.nuti.programmers.one

import spock.lang.Specification

class StringDescendingSortingSpec extends Specification {
  StringDescendingSorting app

  def setup() {
    app = new StringDescendingSorting()
  }

  def test() {
    expect:
    app.solution(s) == result

    where:
    s | result
    "Zbcdefg" | "gfedcbZ"
  }
}
