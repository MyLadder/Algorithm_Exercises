# Longest Substring Without Repeating Characters

From LeetCode 3

**Question:**

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.



**Solution:**

```

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

```


**Explanation:**

最长不重复子串问题,2个指针定义一个窗口,同时在set内记录出现的字母,窗口内字符串不出现出现的字母的时候,右边指针+1,出现重复字母的时候左边指针增加到出现的重复字母的下一位,边跑边记录长度