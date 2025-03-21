class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0;
        
        int l = 0;
        int r = 0;
        
        //r을 0 혹은 0에 가장 가까운 양수로 이동
        while (r < nums.length && nums[r] < 0) {
            r++;
        }

        //l을 0에 가장 가까운 음수로 이동
        l = r - 1;
        
        
        while (l >= 0 && r < nums.length) {
            if (Math.abs(nums[l]) < Math.abs(nums[r])) {
                ans[i] = nums[l] * nums[l];
                l--;
            } else {
                ans[i] = nums[r] * nums[r];
                r++;
            }
            
            i++;
        }
        
        //exhaust
        while (l >= 0) {
            ans[i] = nums[l] * nums[l];
            l--;
            i++;
        }
                
        //exhaust
        while (r < nums.length) {
            ans[i] = nums[r] * nums[r];
            r++;
            i++;
        }
        
        return ans;
    }
}