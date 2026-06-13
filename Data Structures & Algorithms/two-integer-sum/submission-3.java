class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> newNums = new HashMap<>();


        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];

            if(newNums.containsValue(diff)){
                int[] ans = new int[2];
                int index = 0;
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
                newNums.put(i, nums[i]);
            }
        }
        return null;
    }
}
