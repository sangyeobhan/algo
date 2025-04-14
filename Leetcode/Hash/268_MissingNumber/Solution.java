class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) { 
            numSet.add(num); 
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!numSet.contains(i)) {
                return i;
            }
        }
        return -1; //실행 안됨
    }
}