package top.cgglyle.leetcode;

import lombok.val;

import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        char[] charArray = s.toCharArray();
        int reslut = 0;
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            int number = romanMap.get(c);
            if (i + 1 < charArray.length) {
                char nextC = charArray[i + 1];
                switch (c) {
                    case 'I' -> {
                        if (nextC == 'V' || nextC == 'X') {
                            number = -romanMap.get(c);
                        }
                    }
                    case 'X' -> {
                        if (nextC == 'L' || nextC == 'C') {
                            number = -romanMap.get(c);
                        }
                    }
                    case 'C' -> {
                        if (nextC == 'D' || nextC == 'M') {
                            number = -romanMap.get(c);
                        }
                    }
                }
            }
            reslut += number;
        }
        return reslut;
    }
}
