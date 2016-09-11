package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by tanfujun on 9/11/16.
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && (nums[i] == nums[i - 1])) { // avoid duplicates
                continue;
            }
            for (int j = i + 1, k = nums.length - 1; j < k; ) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while ((j < k) && (nums[j] == nums[j - 1])) {// avoid duplicates
                        j++;
                    }
                    while ((j < k) && (nums[k] == nums[k + 1])) {// avoid duplicates
                        k--;
                    }
                } else if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return list;
    }
}
