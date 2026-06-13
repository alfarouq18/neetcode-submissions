class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> vals = new HashMap<>();
       int[] ans = new int[2];
       for(int i = 0; i < nums.length; i++){
        if(vals.containsKey((target - nums[i]))){
            ans[1] = i;
            ans[0] = vals.get(target - nums[i]);
            break;
        }
          vals.put(nums[i], i);
       }

       return ans;
    }
}