package main;

import java.util.Arrays;

/**
 * Created by tanfujun on 9/12/16.
 */
public class Solution {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2];

        for (int start = 0; start < nums.length - 2; start++) {
            for (int mid = start + 1, end = nums.length - 1; mid < end; ) {

                int total = nums[start] + nums[mid] + nums[end];
                if (total == target) {
                    return target;
                } else if (total - target > 0) { //右边指针移动
                    end--;
                    if (Math.abs(total - target) < Math.abs(sum - target)) {
                        sum = total;
                    }

                } else { //左边指针移动
                    mid++;
                    if (Math.abs(total - target) < Math.abs(sum - target)) {
                        sum = total;
                    }
                }

            }
        }

        return sum;

    }
}
