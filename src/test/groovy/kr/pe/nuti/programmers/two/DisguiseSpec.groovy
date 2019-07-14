package kr.pe.nuti.programmers.two

import spock.lang.Specification

class DisguiseSpec extends Specification {
  Disguise app

  void setup() {
    app = new Disguise()
  }

  def "Solution"() {
    expect:
    app.solution(clothes as String[][]) == result

    where:
    clothes | result
    [["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]] | 5
    [["crow_mask", "face"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"]] | 3
  }
}
