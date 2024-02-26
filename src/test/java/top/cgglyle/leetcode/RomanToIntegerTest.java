package top.cgglyle.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {
    RomanToInteger test = new RomanToInteger();

    @Test
    void romanToInt() {
        int i = test.romanToInt("III");
        int i1 = test.romanToInt("LVIII");
        int i2 = test.romanToInt("MCMXCIV");
        assertEquals(3, i);
        assertEquals(58, i1);
        assertEquals(1994, i2);
    }
}