class Solution {
    public int[] getAverages(int[] nums, int k) {
        int windowSize = 2 * k + 1;
        int[] avgs = new int[nums.length];
        Arrays.fill(avgs, -1);
        if (windowSize > nums.length) {
            return avgs;
        }

        //open window
        long currSum = 0;
        for (int right = 0; right < windowSize; right++) {
            currSum += nums[right];
        }
        avgs[k] = (int) (currSum / windowSize);

        //slide
        for (int i = k + 1; i < nums.length - k; i++) {
            int left = i - k;
            int right = i + k;
            currSum += nums[i + k];
            currSum -= nums[i - k - 1];
            avgs[i] = (int) (currSum / windowSize);
        }

        return avgs;
    }
}