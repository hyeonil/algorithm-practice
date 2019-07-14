package kr.pe.nuti.programmers.two

import spock.lang.Specification

class PhoneNumberListSpec extends Specification {
  PhoneNumberList app

  void setup() {
    app = new PhoneNumberList()
  }

  def "Solution"() {
    expect:
    app.solution(phoneBook as String[]) == result

    where:
    phoneBook | result
    ["119", "97674223", "1195524421"] | false
    ["123", "456", "789"] | true
    ["12", "123", "1235", "567", "88"] | false
  }
}
