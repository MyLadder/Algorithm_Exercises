# Palindrome Number

From leetcode 9

**Question:**

Determine whether an integer is a palindrome. Do this without extra space.


**Solution:**

```java

public class Solution {

    public boolean isPalindrome(int x) {
        String strX = x+"";
        String revStr = new StringBuilder(strX).reverse().toString();
        return strX.equals(revStr);
    }
}

```

**Explanation:**

转成字符串判断是否回文。