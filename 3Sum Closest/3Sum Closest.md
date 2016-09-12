# 3Sum Closest

From leetcode 16

**Question:**

Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

```
    For example, given array S = {-1 2 1 -4}, and target = 1.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
    
```    

**Solution:**

```java
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

```



**Explanation:**

做的时候比[3Sum](../3Sum/3Sum.md) 简单点,不用考虑去重,就记录最小值就行了。




