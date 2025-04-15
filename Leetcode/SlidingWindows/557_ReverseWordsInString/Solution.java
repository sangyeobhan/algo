class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        int l = 0;
        
        int r;
        for (r = 0; r < s.length(); r++) {
            if (s.charAt(r) != ' ') {
                continue;
            }
            for (int i = r - 1; i >= l; i--) {
                sb.append(s.charAt(i));
            }
            l = r + 1;
            sb.append(' ');
        }

        for (int i = r - 1; i >= l; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}5555555555556