class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 0;

        for(int num1 : nums){
            for(int num2 : nums){
                if(i != j){
                    if(nums[i] + nums[j] == target){
                        int[] result = new int[]{i,j};
                        return result;
                    }
                }
                j++;
            }
            j = 0;
            i++;
        }
    
        int[] result = new int[]{i,j};
        return result;
    }
}
