package kr.pe.nuti.hackerrank.medium

import spock.lang.Specification

class EncryptionSpec extends Specification {
  Encryption app

  void setup() {
    app = new Encryption()
  }
  def "Encryption"() {
    expect:
    app.encryption(s) == result

    where:
    s | result
    "haveaniceday" | "hae and via ecy"
    "feedthedog" | "fto ehg ee dd"
    "chillout" | "clu hlt io"
    "iffactsdontfittotheorychangethefacts" | "isieae fdtonf fotrga anoyec cttctt tfhhhs"
  }
}
