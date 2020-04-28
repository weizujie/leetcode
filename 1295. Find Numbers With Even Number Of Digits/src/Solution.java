/**
 * @Author: weizujie
 * @Date: 2020/4/28
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
