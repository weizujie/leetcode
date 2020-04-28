import java.util.Arrays;

/**
 * @Author: weizujie
 * @Date: 2020/4/28
 * @Version: 1.0
 * @Github: https://github.com/weizujie
 */
public class Solution {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.smallerNumbersThanCurrent(nums)));
    }

}
