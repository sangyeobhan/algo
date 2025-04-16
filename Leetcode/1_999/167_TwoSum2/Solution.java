class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (target > sum) {
                left++;
                continue;
            }
            if (target < sum) {
                right--;
                continue;
            }

            break;
        }

        return new int[] { left + 1, right + 1 };
    }
}