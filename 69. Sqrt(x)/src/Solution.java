/**
 * @Author: 韦祖杰
 * @Date: 2020/4/6
 * @Version: 1.0
 * @Github: https://github.com/byojiaoxianz7
 */
class Solution {
    public int mySqrt(int x) {
        long left = 1;
        long right = x;
        while (left <= right) {
            long mid = (left + right) / 2;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) right;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(1));
    }
}
