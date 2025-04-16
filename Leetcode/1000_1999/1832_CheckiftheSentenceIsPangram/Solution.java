class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> seen = new HashSet<>();
        
        for (char c: sentence.toCharArray()) {
            seen.add(c);
        }
        
        if (seen.size() == 26) {
            return true;
        }
        return false;
    }
}