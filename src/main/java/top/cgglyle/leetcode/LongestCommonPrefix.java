package top.cgglyle.leetcode;

import lombok.val;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        String start = strs[0];
        String end = strs[strs.length - 1];

        int lessLength = Math.min(start.length(), end.length());

        int i;
        for (i = 0; i < lessLength; i++) {
            if (start.charAt(i) != end.charAt(i)) {
                break;
            }
        }
        return start.substring(0, i);
    }
}
