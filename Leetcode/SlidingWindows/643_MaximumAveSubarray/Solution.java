class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int curr = 0;
        
        for (int right = 0; right < k; right++) {
            curr += nums[right];
        }
        int ans = curr;
        
        for (int right = k; right < nums.length; right++) {
            curr += nums[right];
            curr -= nums[right - k]; // right - k == 이동 전 left
            ans = Math.max(ans, curr);
        }
        
        return (double) ans / k;
    }
}