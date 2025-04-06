class Solution {
    public String reversePrefix(String word, char ch) {
        int r = word.indexOf(ch);
        if (r == -1) {
            return word;
        }

        char[] arr = word.toCharArray();
        for (int i = 0; i <= r; i++) {
            arr[i] = word.charAt(r-i);
        }

        return String.valueOf(arr);
    }
}