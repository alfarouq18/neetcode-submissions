public class Solution {
    public List<List<int>> ThreeSum(int[] nums) {
        Array.Sort(nums);
        List<List<int>> res = new List<List<int>>();

        for(int i = 0; i < nums.Length; i++){
            if(nums[i] > 0){
                break;
            }
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            
            int target = 0 - nums[i];
            int l = i + 1;
            int r = nums.Length - 1;
            while(l < r){
                int sum = nums[l] + nums[r] + nums[i];
                if(sum > 0){
                    r--;
                }else if(sum < 0){
                    l++;
                }else{
                    List<int> arr = new List<int>();
                    arr.Add(nums[i]);
                    arr.Add(nums[l]);
                    arr.Add(nums[r]);
                    res.Add(arr);

                    l++;
                r--;
                while(l < r && nums[l] == nums[l - 1]){
                    l++;
                }
                }
                
            }
        }
        return res;
    }
}
