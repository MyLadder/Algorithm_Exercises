# Container With Most Water

**Question:**

Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container.

**Solution:**

```java

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

```


**Explanation:**

最多能装多少水问题,在数组前后各设置一个指针,然后向中间移动,如果右边高移动左边,反之移动右边,每次移动求一下面积,在指针重合的时候就记录出来最大面积