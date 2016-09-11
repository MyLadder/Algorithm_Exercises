package main;

/**
 * Created by tanfujun on 9/11/16.
 */
public class Solution {

    public boolean isPalindrome(int x) {
        String strX = x+"";
        String revStr = new StringBuilder(strX).reverse().toString();
        return strX.equals(revStr);
    }
}
