package kr.pe.nuti.hackerrank.medium

import spock.lang.Specification

class CountLuckSpec extends Specification {
  CountLuck app

  void setup() {
    app = new CountLuck();
  }

  def "CountLuck"() {
    expect:
    app.countLuck(matrix as String[], k) == result

    where:
    matrix | k | result
    ["..........*", ".XXXXXXXXXX", "...........", "XXXXXXXXXX.", "M.........."] | 0 | "Impressed"
    ["XXXXXXXXXXXXXXXXX", "XXX.XX.XXXXXXXXXX", "XX.*..M.XXXXXXXXX", "XXX.XX.XXXXXXXXXX", "XXXXXXXXXXXXXXXXX"] | 10 | "Oops!"
    ["XXXXXXXXXXXXXXXXX", "XXX.XX.XXXXXXXXXX", "XX.*..M.XXXXXXXXX", "XXX.XX.XXXXXXXXXX", "XXXXXXXXXXXXXXXXX"] | 1 | "Impressed"
    [".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.", "M.......................................*", ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X."] | 20 | "Impressed"
    [".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     "M........................................",
     "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     ".........................................",
     ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     ".........................................",
     "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     ".........................................",
     ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     ".........................................",
     "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     ".........................................",
     ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     ".........................................",
     "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     ".........................................",
     ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     ".........................................",
     "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     ".........................................",
     ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     ".........................................",
     "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     ".........................................",
     ".XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     ".........................................",
     "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     ".*......................................."] | 280 | "Impressed"
    ["XXXXXXXXXXXXXXXXX",
     "XXX.XX.XXXXXXXXXX",
     "XX.*..M.XXXXXXXXX",
     "XXX.XX.XXXXXXXXXX",
     "XXXXXXXXXXXXXXXXX"] | 10 | "Oops!"
    ["XXXXXXXXXXXXXXXXX",
     "XXX.XX.XXXXXXXXXX",
     "XX.*..M.XXXXXXXXX",
     "XXX.XX.XXXXXXXXXX",
     "XXXXXXXXXXXXXXXXX"] | 1 | "Impressed"
    [".X.XXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.X.X.",
     "...XXXXXXXXXXXXXXXXXXX...................",
     ".X..X.X.X.X.X.X.X..XXXX*X.X.X.X.X.X.X.XX.",
     ".XXXX.X.X.X.X.X.X.XX.X.X.X.X.X.X.X.X.X.X.",
     ".........................................",
     ".XX.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     ".........................................",
     "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XX.",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     ".........................................",
     ".XX.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     ".........................................",
     "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XX.",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     ".........................................",
     ".XX.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     ".........................................",
     "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XX.",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     ".........................................",
     ".XX.X.X.X.XX.X.XX.X.X.X.X.X.X.X.X.X.X.X.X",
     ".X.X.X.X.X.XXX.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     "X........................................",
     "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XX.",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     ".........................................",
     ".X.XX.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XX.XX",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XMX.",
     ".X....................................X..",
     "..X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XX.",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     ".X...................................X...",
     ".XX.X.X.X.X.X.X.X.X.X.X.X.X.X.XX.XX.XXXX.",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     ".........................................",
     "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XX.",
     ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
     "........................................."] | 294 | "Impressed"
  }
}
