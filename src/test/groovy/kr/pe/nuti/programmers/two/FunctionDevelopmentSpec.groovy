package kr.pe.nuti.programmers.two

import spock.lang.Specification

class FunctionDevelopmentSpec extends Specification {
  FunctionDevelopment app

  void setup() {
    app = new FunctionDevelopment()
  }

  def "Solution"() {
    expect:
    app.solution(progresses as int[], speeds as int[]) == result as int[]

    where:
    progresses | speeds | result
    [93,30,55] | [1,30,5] | [2,1]
  }
}
