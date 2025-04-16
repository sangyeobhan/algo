class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> loserMap = new HashMap<>();

        for (int[] match: matches) {
            int winner = match[0];
            int loser = match[1];

            loserMap.put(winner, loserMap.getOrDefault(winner, 0));
            loserMap.put(loser, loserMap.getOrDefault(loser, 0) + 1);
        }

        List<Integer> alwaysWinners = new ArrayList<>();
        List<Integer> oneTimeLosers = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : loserMap.entrySet()) {
            if (entry.getValue() == 0) {
                alwaysWinners.add(entry.getKey());
                continue;
            }

            if (entry.getValue() == 1) {
                oneTimeLosers.add(entry.getKey());
            }
        }

        Collections.sort(alwaysWinners);
        Collections.sort(oneTimeLosers);

        return Arrays.asList(alwaysWinners, oneTimeLosers);
    }
}