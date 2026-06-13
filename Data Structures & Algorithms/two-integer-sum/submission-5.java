class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> vals = new HashMap<>();
       int[] ans = new int[2];

       for(int i = 0; i < nums.length; i++){
        int diff = target - nums[i];
        int index = 0;

        if(vals.containsValue(diff)){
            for(int j = 0; j < nums.length; j++){
                if(nums[j] == diff){
                    index = j;
                    break;
                }
            }
            ans[0] = index;
            ans[1] = i;
            return ans;
        }
        else{
            vals.put(i, nums[i]);
        }

       } 
       return null;
    }
}