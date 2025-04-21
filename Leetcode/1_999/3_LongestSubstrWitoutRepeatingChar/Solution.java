class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 0;
        Map<Character, Integer> charCount = new HashMap<>();

        char[] arr = s.toCharArray();
        for (int right = 0; right < s.length(); right++) {
            int count = charCount.getOrDefault(arr[right], 0);
            if (count == 0) {
                charCount.put(arr[right], 1);
                max = Math.max(max, right - left + 1);
                continue;
            }

            while (arr[left] != arr[right]) {
                charCount.put(arr[left], 0);
                left++;
            }
            charCount.put(arr[left], 1);
            left++;
        }

        return max;
    }
}