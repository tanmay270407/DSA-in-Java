class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        
        if(n <= 1) {
            return false;
        }
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j <= i + k && j < n; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}