package ByteDance.code_53_最大子数组和;

/**
 * completion time = 2023.10.23
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int preSum = 0, min = 0, ans = nums[0];
        for (int num : nums) {
            preSum += num;
            if (preSum - min > ans) {
                ans = preSum - min;
            }
            min = Math.min(preSum, min);
        }
        return ans;
    }
}