class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> res = new ArrayList<>();        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                break;
            }
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            int sum = 0 - nums[i];
            while(l < r){
                if(nums[l] + nums[r] > sum){
                    r--;
                }else if(nums[l] + nums[r] < sum){
                    l++;
                }else{
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
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
