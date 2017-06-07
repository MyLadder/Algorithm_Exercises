/**
 * Created by tanfujun on 6/2/17.
 */
public class Solution {
    public int lengthOfLastWord(String s) {

        if (s.trim().isEmpty()){
            return 0;
        }

        String[] strings = s.split(" ");

        String lastword = strings[strings.length-1];

        return lastword.length();

    }
}
