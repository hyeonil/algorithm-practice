package kr.pe.nuti.programmers.two

import spock.lang.Specification

class BridgeTruckSpec extends Specification {
  BridgeTruck app

  void setup() {
    app = new BridgeTruck()
  }

  def "Solution"() {
    expect:
    app.solution(bridgeLength, weight, truckWeights as int[]) == result

    where:
    bridgeLength | weight | truckWeights | result
    2 | 10 | [7,4,5,6] | 8
    100 | 100 | [10] | 101
    100 | 100 | [10,10,10,10,10,10,10,10,10,10] | 110
  }
}
