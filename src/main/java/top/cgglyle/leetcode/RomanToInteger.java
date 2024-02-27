package top.cgglyle.leetcode;

public class RomanToInteger {
    public int romanToInt(String s) {
        char[] charArray = s.toCharArray();
        int reslut = 0;
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            int number = getValue(c);
            if (i + 1 < charArray.length && number < getValue(charArray[i + 1])) {
                reslut -= number;
            } else {
                reslut += number;
            }
        }
        return reslut;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I' -> {
                return 1;
            }
            case 'V' -> {
                return 5;
            }
            case 'X' -> {
                return 10;
            }
            case 'L' -> {
                return 50;
            }
            case 'C' -> {
                return 100;
            }
            case 'D' -> {
                return 500;
            }
            case 'M' -> {
                return 1000;
            }
            default -> {
                return 0;
            }
        }
    }
}
