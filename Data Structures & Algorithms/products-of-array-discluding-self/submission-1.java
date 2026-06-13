class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] answer = new int[size];

        int prefix = 1;
        for(int i = 0; i < size; i++){
            answer[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for(int i = size -1; i >= 0; i--){
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;
     }
}
