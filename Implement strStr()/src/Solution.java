/**
 * Created by tanfujun on 6/2/17.
 */
public class Solution {

    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)){
            return -1;
        }else {
            return haystack.indexOf(needle);
        }


    }
}
