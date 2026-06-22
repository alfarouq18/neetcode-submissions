public class Solution {
    public int LongestConsecutive(int[] nums) {
        HashSet<int> set = new HashSet<int>();

        for(int i = 0; i < nums.Length; i++){
            set.Add(nums[i]);
        }
        int max = 0;
        for(int i = 0; i < nums.Length; i++){
            int num = nums[i];
            if(!set.Contains(num - 1)){
                int max1 = 1;
                while(set.Contains(num + 1)){
                    max1++;
                    num++;
                }

                max = Math.Max(max1, max);
            }
        }
        return max;

    }
}
