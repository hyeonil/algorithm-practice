package kr.pe.nuti.programmers.two

import spock.lang.Specification

class JoystickSpec extends Specification {
  Joystick app

  void setup() {
    app = new Joystick()
  }

  def "Solution"() {
    expect:
    app.solution(name) == result

    where:
    name | result
    "JEROEN" | 56
    "JAN" | 23
    "AZAAAZ" | 5
    "ZAAAZAAA" | 6
    "ZAAAZAAAZAAA" | 11
    "ABAAAAAAAAABB" | 7
  }
}
