class Solution {
    public int findMaxLength(int[] nums) {
        //key에 zeroExcess, value에 해당 zeroExcess만족하는 prefix-array중 최소 길이
        Map<Integer, Integer> prefixes = new HashMap<>(); 
        prefixes.put(0, 0); //빈 배열

        int maxLength = 0;
        // 0의 개수 - 1의 개수, ex) 0이 2개 1이 3개이면 value = -1
        int zeroExcess = 0;
        for(int i = 0; i< nums.length; i++) {
            if (nums[i] == 0) {
                zeroExcess++;
            } else {
                zeroExcess--;
            }

            if (prefixes.containsKey(zeroExcess)) {
                maxLength = Math.max(maxLength, i + 1 - prefixes.get(zeroExcess));
            } else {
                prefixes.put(zeroExcess, i+1);
            }
        }
        
        return maxLength;
    }
}