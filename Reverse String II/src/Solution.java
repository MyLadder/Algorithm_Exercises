import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanfujun on 6/1/17.
 */
public class Solution {
    public String reverseStr(String s, int k) {

        List<String> stringList = new ArrayList<String>();
        for (int i = 0; i < s.length(); i += k) {
            if (i + k > s.length()) {
                stringList.add(s.substring(i, i + k));
            } else {
                stringList.add(s.substring(i, s.length()));
            }
        }
        String result = "";

        for (int i = 0; i < stringList.size(); i++) {
            if (i % 2 == 0) {
                result += new StringBuffer(stringList.get(i)).reverse().toString();

            } else {
                result += stringList.get(i);
            }

        }

        return result;


    }
}