class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int x = 0; x < nums.length; x++){
                if(nums[i] == nums[x] && i != x){
                    return true;
                }
            }
        }

        return false;
    }
}