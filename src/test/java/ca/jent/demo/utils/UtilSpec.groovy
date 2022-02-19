package ca.jent.demo.utils

import spock.lang.Specification

class UtilSpec extends Specification {

    def "test Util.convertDecimalNumberAsStringToPositiveInteger(#strValue).orElse(#defaultValue) == #expectedConversion"() {

        expect:
        expectedConversion == Util.convertDecimalNumberAsStringToPositiveInteger(strValue).orElse(defaultValue)

        where:

        strValue | defaultValue | expectedConversion
        ""       | null         | null
        null     | 0            | 0
        "abc"    | 0            | 0
        "0"      | 5            | 0
        "2.0"    | 5            | 2
        "3.9"    | 5            | 4
        "1R7"    | 5            | 5
        "-2"     | 10           | 10
        "-3.9"   | 10           | 10

    }

    def "test Util.convertDecimalNumberAsStringToInteger(#strValue).apply(#defaultValue) == #expectedConversion"() {

        expect:
        expectedConversion == Util.convertDecimalNumberAsStringToInteger(strValue).apply(defaultValue)

        where:

        strValue | defaultValue | expectedConversion
        ""       | null         | null
        null     | 0            | 0
        "abc"    | 0            | 0
        "0"      | 5            | 0
        "2.0"    | 5            | 2
        "3.9"    | 5            | 4
        "1R7"    | 5            | 5
        "-2"     | 10           | -2
        "-3.9"   | 10           | -4
    }
}
