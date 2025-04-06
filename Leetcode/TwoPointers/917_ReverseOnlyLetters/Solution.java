class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int l = 0;
        int r = s.length() - 1;

        while(l < s.length() - 1 && !isEnglishLetter(arr[l])) {
            l++;
        }
        while(r > 0 && !isEnglishLetter(arr[r])) {
            r--;
        }

        while(l < r) {
            char tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;

            l++;
            r--;
            
            while(l < s.length() - 1 && !isEnglishLetter(arr[l])) {
                l++;
            }
            while(r > 0 && !isEnglishLetter(arr[r])) {
                r--;
            }
        }

        return new String(arr);
    }
    
    public static boolean isEnglishLetter(char c) {
        return ('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z');
    }
}