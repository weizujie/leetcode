/**
 * @Author: 韦祖杰
 * @Date: 2020/4/6
 * @Version: 1.0
 * @Github: https://github.com/byojiaoxianz7
 */
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
