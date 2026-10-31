class Solution {
    public int[] sortArray(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int index = 0;
            int min = Integer.MAX_VALUE;
            for(int j = i; j < nums.length; j++){
                if(min >= nums[j]){
                    min = nums[j];
                    index = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
        return nums;
    }
}