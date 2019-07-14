package kr.pe.nuti.hackerrank.medium

import spock.lang.Specification

class EmasSuperComputerSpec extends Specification {
  EmasSuperComputer app
  void setup() {
    app = new EmasSuperComputer()
  }

  def "TwoPluses"() {
    expect:
    app.twoPluses(grid as String[]) == result;

    where:
    grid | result
    ["GGGGGGG", "BGBBBBG", "BGBBBBG", "GGGGGGG", "GGGGGGG", "BGBBBBG"] | 5
    ["GGGGGGGG", "GBGBGGBG", "GBGBGGBG", "GGGGGGGG", "GBGBGGBG", "GGGGGGGG", "GBGBGGBG", "GGGGGGGG"] | 81
  }
}
