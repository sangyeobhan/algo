class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Pointer = m - 1;
        int nums2Pointer = n - 1;
        int i = m + n - 1;

        while (nums1Pointer >= 0 && nums2Pointer >= 0) {
            if (nums1[nums1Pointer] > nums2[nums2Pointer]) {
                nums1[i] = nums1[nums1Pointer];
                nums1Pointer--;
            } else {
                nums1[i] = nums2[nums2Pointer];
                nums2Pointer--;
            }
            i--;
        }

        while (nums1Pointer >= 0) {
            nums1[i] = nums1[nums1Pointer];
            nums1Pointer--;
            i--;
        }

        while (nums2Pointer >= 0) {
            nums1[i] = nums2[nums2Pointer];
            nums2Pointer--;
            i--;
        }
    }
}