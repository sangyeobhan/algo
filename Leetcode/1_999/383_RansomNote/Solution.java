class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        
        HashMap<Character, Integer> ransomNoteMap = new HashMap<>();
        HashMap<Character, Integer> magazineMap = new HashMap<>();

        for (char c: ransomNote.toCharArray()) {
            ransomNoteMap.put(c, ransomNoteMap.getOrDefault(c, 0) + 1);
        }

        for (char c: magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry: ransomNoteMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();

            if (count > magazineMap.getOrDefault(c, 0)) {
                return false;
            }
        }
        return true;

    }
}