class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();


        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                break;
            }
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            

            int l = i + 1;
            int r = nums.length - 1;

            Map<Integer, Integer> count = new HashMap<>();
            int target = 0 - nums [i];

            while(l < r){
                int sum = nums[i] + nums[r] + nums[l];
                if(sum > 0){
                    r--;
                }else if(sum < 0){
                    l++;
                }else{
                    ArrayList<Integer> tempRes = new ArrayList<>();
                    tempRes.add(nums[i]);
                    tempRes.add(nums[l]);
                    tempRes.add(nums[r]);
                    res.add(tempRes);
                    l++;
                    r--;
                    while(l < r && nums[l] == nums [l - 1]){
                        l++;
                    }
                }
                
            }
        }
        return res;
    }
}
