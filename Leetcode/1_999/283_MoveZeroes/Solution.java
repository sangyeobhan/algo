class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] != 0) {
                nums[l] = nums[r];
                l++;
            }
        }

        for (int r = l; r < nums.length; r++) {
            nums[r] = 0;
        }
    }
}