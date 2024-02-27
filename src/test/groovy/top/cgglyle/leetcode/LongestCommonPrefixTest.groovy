package top.cgglyle.leetcode

import spock.lang.Specification

class LongestCommonPrefixTest extends Specification {
    def "LongestCommonPrefix"() {
        given:
        def longestCommonPrefix = new LongestCommonPrefix()

        when:
        def answer = longestCommonPrefix.longestCommonPrefix(question as String[])

        then:
        answer == finalAnswer

        where:
        question | finalAnswer
        ["flower","flow","flight"] | "fl"
        ["flower","flow","floight"] | "flo"
        ["flowersss","flowerss","flowerss"] | "flowerss"
        ["a"] | "a"
    }
}
