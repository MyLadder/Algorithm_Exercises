package main;

/**
 * Created by tanfujun on 9/11/16.
 */
public class Solution {
    public int maxArea(int[] height) {
        int indexStart = 0;
        int indexEnd = height.length - 1;
        int max = 0;
        while (indexStart < indexEnd) {
            int leftHeight = height[indexStart];
            int rightHeight = height[indexEnd];
            int area = (leftHeight < rightHeight ? leftHeight : rightHeight) * (indexEnd - indexStart);
            if (area > max) {
                max = area;
            }
            if (leftHeight>rightHeight){
                indexEnd--;
            }else {
                indexStart++;
            }
        }
        return max;
    }
}