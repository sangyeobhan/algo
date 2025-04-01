class Solution {
    public int minStartValue(int[] nums) {
        int curr = nums[0];
        int min = curr;
        
        for(int i = 1; i < nums.length; i++) {
            curr += nums[i];
            min = Math.min(min, curr);
        }
        
        return Math.max(1, 1 - min);
    }
}