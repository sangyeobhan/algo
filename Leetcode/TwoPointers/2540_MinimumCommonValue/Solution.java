class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int l = 0;
        int r = 0;
        
        while (l < nums1.length && r < nums2.length) {
            if (nums1[l] < nums2[r]) {
                l++;
            } else if (nums1[l] > nums2[r]) {
                r++;
            } else { // nums1[l] == nums2[r]
                return nums1[l];
            }
        }

        return -1;
    }
}