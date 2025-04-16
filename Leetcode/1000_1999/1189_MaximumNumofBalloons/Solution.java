class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> balloonCollector = new HashMap<>();
        Set<Character> balloonLetters = Set.of('b','a','l','o','n');
        
        for (char c: text.toCharArray()) {
            if (balloonLetters.contains(c)) {
                balloonCollector.put(c, balloonCollector.getOrDefault(c, 0) + 1);
            }
        }
        
        if (balloonCollector.size() != balloonLetters.size()) {
            return 0;
        }

        int answer = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry: balloonCollector.entrySet()) {
            char c = entry.getKey();
            
            if (c == 'l' || c == 'o') {
                answer = Math.min(answer, entry.getValue() / 2);
                continue;
            }
            answer = Math.min(answer, entry.getValue());
        }
        return answer;
    }
}