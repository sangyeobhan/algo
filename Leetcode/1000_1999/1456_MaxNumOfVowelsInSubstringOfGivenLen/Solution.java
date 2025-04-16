class Solution {
    public int maxVowels(String s, int k) {
        int curr = 0;

        for (int r = 0; r <k; r++) {
            if (isVowel(s.charAt(r))) {
                curr++;
            }
        }
        int ans = curr;

        for (int r = k; r < s.length(); r++) {
            if (isVowel(s.charAt(r))) {
                curr++;
            }
            if (isVowel(s.charAt(r-k))) {
                curr--;
            }
            ans = Math.max(ans, curr);
        }
        return ans;
    }

    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}