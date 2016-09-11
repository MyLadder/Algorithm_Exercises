package main;

/**
 * Created by tanfujun on 9/11/16.
 */
public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String str0 = strs[0];

        for (int i = 0; i < str0.length(); i++) {
            char x = str0.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i || strs[j].charAt(i) != x) {
                    return str0.substring(0, i);
                }
            }
        }

        return str0;

    }
}
