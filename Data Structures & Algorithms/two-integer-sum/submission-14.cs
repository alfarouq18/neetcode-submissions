public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        Dictionary<int, int> diffs = new Dictionary<int, int>();
        for(int i = 0; i < nums.Length; i++){
            diffs[nums[i]] = i;
        }
        int[] res = new int[2];
        for(int i = 0; i < nums.Length; i++){
            int diff = target - nums[i];
            if(diffs.ContainsKey(diff) && diffs[diff] != i){
                res[0] = Math.Min(i, diffs[diff]);
                res[1] = Math.Max(i, diffs[diff]);
            }
        }
        return res;
    }
}
