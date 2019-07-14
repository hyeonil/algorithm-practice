package kr.pe.nuti.programmers.one

import spock.lang.Specification

class MaratonPlayerSpec extends Specification {
  MaratonPlayer app

  def setup() {
    app = new MaratonPlayer()
  }

  def "verification"() {
    expect:
    app.solution(participant as String[], completion as String[]) == result

    where:
    participant | completion | result
    ["leo", "kiki", "eden"] | ["eden", "kiki"] | "leo"
    ["marina", "josipa", "nikola", "vinko", "filipa"] | ["josipa", "filipa", "marina", "nikola"] | "vinko"
    ["mislav", "stanko", "mislav", "ana"] | ["stanko", "ana", "mislav"] | "mislav"
  }
}
