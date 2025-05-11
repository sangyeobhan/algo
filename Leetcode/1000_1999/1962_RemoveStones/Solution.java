class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int pile : piles) {
            maxHeap.add(pile);
        }

        for (int i = 0; i < k; i++) {
            int pile = maxHeap.remove();
            maxHeap.add(pile - Math.floorDiv(pile, 2));
        };

        int sum = 0;
        for (int pile : maxHeap) {
            sum += pile;
        }
        return sum;
    }
}