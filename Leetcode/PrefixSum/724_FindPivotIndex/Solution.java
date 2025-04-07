class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int[] prefix = new int[len];
        prefix[0] = nums[0];
        for (int i = 1; i < len; i++) {
            prefix[i] += prefix[i-1] + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (prefix[i] - nums[i] == prefix[len - 1] - prefix[i]) {
                return i;
            }
        }
        return -1;
    }
}