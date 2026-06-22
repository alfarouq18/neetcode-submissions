public class Solution {
    public int[] ProductExceptSelf(int[] nums) {
        int[] prefix = new int[nums.Length];
        int num = 1;
        for(int i = 0; i < prefix.Length; i++){
            prefix[i] = num;
            num = nums[i] * num;
        }

        int[] suffix = new int[nums.Length];
        int index = nums.Length - 1;
        num = 1;
        for(int i = nums.Length - 1; i >= 0; i--){
            suffix[index] = num;
            num = nums[i] * num;
            index--;
        }
        int[] res = new int[nums.Length];

        for(int i = 0; i < nums.Length; i++){
            res[i] = suffix[i] * prefix[i];
        }
        return res;

    }
}
 