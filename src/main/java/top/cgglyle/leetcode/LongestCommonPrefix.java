package top.cgglyle.leetcode;

import lombok.val;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int strLength = strs.length;
        if (strLength == 1) {
            return strs[0];
        }

        int lessInternalStrLength = 0;
        for (int i = 0; i < strs.length; i++) {
            final int internalStrLength = strs[i].length();
            if (i == 0) {
                lessInternalStrLength = internalStrLength;
            }
            if (lessInternalStrLength > internalStrLength) {
                lessInternalStrLength = internalStrLength;
            }
        }


        String finalStr = "";
        for (int i = 0; i < lessInternalStrLength; i++) {
            char equalChar = 0;
            for (int j = 0; j < strs.length; j++) {
                String str = strs[j];
                char c = str.toCharArray()[i];
                if (j == 0) {
                    equalChar = c;
                    continue;
                }
                if (equalChar == c && j != strs.length - 1) {
                    continue;
                } else if (equalChar == c && j == strLength - 1) {
                    finalStr += c;
                } else {
                    return finalStr;
                }
            }
        }

        return finalStr;
    }
}
