# Longest Common Prefix

From leetcode 14

**Question:**

Write a function to find the longest common prefix string amongst an array of strings.


**Solution:**

```java

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


```

**Explanation:**

寻找字符串的最长公共前缀。如果某个字符串当前index字符和要判断str0的index字符不一样就立即返回,判断的字符串如果短于当前index也立即返回.