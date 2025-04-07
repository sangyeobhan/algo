class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int curr = 0;
        int answer = nums.length + 1;

        for(int r = 0; r < nums.length; r++) {
            curr += nums[r];
            while(l < r && curr - nums[l] >= target) {
                curr -= nums[l];
                l++;
            }
            if (curr >= target) {
                answer = Math.min(answer, r - l + 1);
            }
        }

        return (answer != nums.length + 1) ? answer : 0;
    }
}