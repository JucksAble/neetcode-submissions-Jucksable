class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numberCounts = new HashMap<>();

        for(int num : nums){
            numberCounts.merge(num, 1, Integer::sum);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (n1, n2) -> numberCounts.get(n1) - numberCounts.get(n2)
        );

        for (int n : numberCounts.keySet()) {
            heap.add(n);
            
            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }
        return result;
    }
}
