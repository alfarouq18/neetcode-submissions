class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> keys = new HashSet<>();
        for(int i = 0; i < nums.length; i ++){
            if(keys.contains(nums[i])){
                return true;
            }
            keys.add(nums[i]);
        }
        return false;
    }
}