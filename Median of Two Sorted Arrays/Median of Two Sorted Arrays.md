# Median of Two Sorted Arrays

From leetcode 4

**Question:**

There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

**Example 1:**

```
nums1 = [1, 3]
nums2 = [2]

```
The median is 2.0

**Example 2:**

```
nums1 = [1, 2]
nums2 = [3, 4]

```

The median is (2 + 3)/2 = 2.5

**Solution:**

```
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

```

**Explanation:**

重新组合下排序搞定