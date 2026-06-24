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
            int l = i + 1;
            int r = nums.Length - 1;

            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
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
                    while(l < r && nums[r] == nums[r + 1]){
                        r--;
                    }
                }
            }
        }
        return res;
    }
}
