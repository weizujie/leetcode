import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums2);

        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            if (binarySearch(nums2, num)) {
                set.add(num);
            }
        }

        // 将集合转化为数组
        int[] ret = new int[set.size()];
        int i = 0;
        for (int num : set) {
            ret[i++] = num;
        }
        return ret;
    }

    // 二分法查找有无重复数字
    public boolean binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // 如果 target 在数组中
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                left = mid +1 ;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}