# Description:
> Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a2 + b2 = c.

# Example

> Input: 5
>
> Output: True
>
> Explanation: 1 * 1 + 2 * 2 = 5
>
> --------------------
> Input: 3
>
> Output: False


# Ideas

- Binary Search
    - awda

# Solution

```java
class Solution {
    public boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int) Math.sqrt(c);
        while (left <= right) {
            int powNum = left * left + right * right;
            if (powNum == c) {
                return true;
            } else if (powNum < c){
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}
```
