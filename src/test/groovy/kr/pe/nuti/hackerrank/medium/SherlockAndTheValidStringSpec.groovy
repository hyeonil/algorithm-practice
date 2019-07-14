package kr.pe.nuti.hackerrank.medium

import spock.lang.Specification

class SherlockAndTheValidStringSpec extends Specification {
  SherlockAndTheValidString app

  void setup() {
    app = new SherlockAndTheValidString()
  }

  def "IsValid"() {
    expect:
    app.isValid(s) == result

    where:
    s | result
    "aabbc" | "YES"
    "aabbcd" | "NO"
    "aabbccddeefghi" | "NO"
    "abcdefghhgfedecba" | "YES"
  }
}
