/**
 * Created by tanfujun on 6/2/17.
 */
public class Solution {

    public boolean isPalindrome(String s) {
        if (s==null){
            return false;
        }
        if (s.isEmpty()){
            return true;
        }

        String s1 = s.replaceAll("[^a-z^A-Z^0-9]", "").toLowerCase();

        int i = 0, j = s1.length();

        while (i < j) {
            if (s1.charAt(i) != s1.charAt(j)) {
                return false;
            }
            i++;
            j--;

        }
        return true;

    }
}
