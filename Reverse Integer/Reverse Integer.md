# Reverse Integer

From leetcode 7

**Question:**

Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

**Solution:**
```java
   public static void main(String argas[]) {
        Solution solution = new Solution();
        solution.reverse(1534236469);
    }

    public int reverse(int x) {

        boolean isnegative = x < 0;
        int abs = Math.abs(x);
        int temp = abs;
        List<Integer> list = new ArrayList<Integer>();
        while (temp / 10 != 0) {
            int l1 = temp % 10; //最后一位
            list.add(l1);
            temp = temp / 10;
        }
        list.add(temp);

        double result = 0;
        for (int i = 0; i < list.size(); i++) {
            result = result + list.get(i) * Math.pow(10,(list.size() - i-1) );
        }
        double dResult = isnegative ? 0 - result : result;
        if (dResult>Integer.MAX_VALUE||dResult<Integer.MIN_VALUE){
            dResult=0;
        }

        return (int) dResult;


    }
```


**Explanation:**

注意超过int最大值的情况