class Solution {
    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int stick : sticks) {
            minHeap.offer(stick);
        }

        int totalCost = 0;
        while (minHeap.size() > 1) {
            int stepCost = minHeap.poll() + minHeap.poll();
            totalCost += stepCost;
            minHeap.offer(stepCost);
        }
        return totalCost;
    }
}