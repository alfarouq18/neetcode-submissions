class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!count.containsKey(nums[i])){
                count.put(nums[i], i);
            }
        }
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(count.containsKey(diff) && count.get(diff) != i){
                res[1] = i;
                res[0] = count.get(diff);
        }
        }
        return res;
    }
}
