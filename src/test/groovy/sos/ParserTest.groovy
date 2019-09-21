package sos

import spock.lang.Specification

class ParserTest extends Specification {

    Parser parser = new Parser()

    def "should return an integer representing the number of letters changed during transmission"(
            String signal,
            int result
    ) {
        expect:
        parser.calculateChanges(signal) == result

        where:
        signal                      | result
        "SOS"                       | 0
        "XOS"                       | 1
        "SXS"                       | 1
        "SOX"                       | 1
        "XXS"                       | 2
        "SXX"                       | 2
        "XXX"                       | 3
        "SOSSPSSQSSOR".multiply(99) | 3 * 99
    }
}

