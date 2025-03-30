class Solution {
    public int longestOnes(int[] nums, int k) {
        int currZeroCount = 0;
        int ans = 0;
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                currZeroCount++;
            }
            
            while (currZeroCount > k) {
                if (nums[left] == 0) {
                    currZeroCount--;
                }
                left++;
            }
            
            ans = Math.max(ans, right - left + 1);
        }
        
        return ans;
    }
}