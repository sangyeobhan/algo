class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int l = 0; 
        int curr = 0; 
        int ans = 0;
        for (int r = 0; r < s.length(); r++) {
            curr += Math.abs(s.charAt(r) - t.charAt(r));
            while (curr > maxCost) {
                curr -= Math.abs(s.charAt(l) - t.charAt(l));
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}