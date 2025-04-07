class Solution {
    public int largestAltitude(int[] gain) {
        int curr = 0;
        int ans = 0;
        for (int n: gain) {
            curr += n;
            ans = Math.max(ans, curr);
        }
        return ans;
    }
}