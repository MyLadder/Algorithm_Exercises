# 3Sum

From leetcode 15

**Question:**
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

```
For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]

```

**Solution:**

```java

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

```


**Explanation:**

这道题求3个数和是零,就是求两个数的和是另一个数的负数。这题做的时间比较久,主要浪费在去重问题的思考上:

1. 首先排序

2. 要找的数(首位两数和的负数)是从第一个数的下一个开始向前,这样的话出现重复要找的数都不需要找了。


开始做的时候犯了一个错误,就是固定一个数,每次找的时候都是2个指针直接指到头和尾开始找,这样没法过滤重复的。