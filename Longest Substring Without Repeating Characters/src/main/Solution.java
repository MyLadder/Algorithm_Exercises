package main;

import java.util.HashSet;

/**
 * Created by tanfujun on 9/8/16.
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<Character>();
        int max = 0;
        int start = 0;
        int end = 0;
        while (end < s.length()) {
            if (set.contains(s.charAt(end))) {
                if (max < end - start) {
                    max = end - start;
                }
                while (s.charAt(start) != s.charAt(end)) {
                    set.remove(s.charAt(start));
                    start++;
                }
                start++;
            } else {
                set.add(s.charAt(end));
            }
            end++;
        }
        max = Math.max(max, end - start);

        return max;
    }
}