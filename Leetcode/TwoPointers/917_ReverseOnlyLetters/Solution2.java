class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int l = 0;
        int r = s.length() - 1;

        while(l < r) {
            if (!isEnglishLetter(arr[l])) {
                l++;
                continue;
            }

            if (!isEnglishLetter(arr[r])) {
                r--;
                continue;
            }

            char tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;

            l++;
            r--;
        }

        return new String(arr);
    }
    
    public static boolean isEnglishLetter(char c) {
        return ('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z');
    }
}