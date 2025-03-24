class Solution {
    public String reverseStr(String s, int k) {
        // k=3이면 0~2, 6~8
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i += 2*k) {
            int left = i;
            int right = Math.min(i+k-1, arr.length-1);

            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        return String.valueOf(arr);
    }
}