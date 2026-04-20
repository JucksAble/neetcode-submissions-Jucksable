class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numberCounts = new HashMap<>();

        for(int num : nums){
            numberCounts.merge(num, 1, Integer::sum);
        }

        List<Integer>[] buckets = new List[nums.length + 1];

        for (int key : numberCounts.keySet()) {
            int frequency = numberCounts.get(key);
            
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            
            buckets[frequency].add(key);
        }

        int[] result = new int[k];
        int x = 0;

        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] != null) {
                for (int getal : buckets[i]) {
                    result[x] = getal;
                    x++;

                    if (x == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
