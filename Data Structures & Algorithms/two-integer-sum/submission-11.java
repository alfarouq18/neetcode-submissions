class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(count.containsKey(diff)){
                int[] res = new int[2];
                res[0] = count.get(diff);
                res[1] = i;
                return res;
            }
            count.put(nums[i], i);
        }
        return null;
    }
}
