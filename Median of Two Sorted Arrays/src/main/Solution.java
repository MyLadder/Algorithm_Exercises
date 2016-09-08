package main;

import java.util.Arrays;

/**
 * Created by tanfujun on 9/8/16.
 */
public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combin = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, combin, 0, nums1.length);
        System.arraycopy(nums2, 0, combin, nums1.length, nums2.length);
        Arrays.sort(combin);
        if (combin.length % 2 == 0) {
            int a = combin[combin.length / 2 - 1];
            int b = combin[combin.length / 2];
            return (a + b) / 2.0f;
        } else {
            return combin[combin.length / 2 + 1];
        }
    }
}