/**
 * @Author: weizujie
 * @Date: 2020/5/14
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
