class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Integer[][] dp = new Integer[nums.length][2001];

        return Target(nums, target, 0, 0, dp);
    }

    public int Target(int[] nums, int target, int index, int sum, Integer[][] dp) {

        if (index == nums.length) {
            if (sum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        int s = sum + 1000;

        if (dp[index][s] != null) {
            return dp[index][s];
        }

        int add = Target(
            nums, target, index + 1, sum + nums[index], dp
        );

        int sub = Target(
            nums, target, index + 1, sum - nums[index], dp
        );

        dp[index][s] = add + sub;

        return dp[index][s];
    }
}