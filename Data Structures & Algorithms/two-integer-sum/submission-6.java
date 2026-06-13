class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> newNums = new HashMap<>();


        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];

            if(newNums.containsKey(diff)){
                return new int[] {newNums.get(diff), i};
            }
            else{
                newNums.put(nums[i], i);
            }
        }
        return null;
    }
}
