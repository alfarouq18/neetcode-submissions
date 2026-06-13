class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> vals = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int count = vals.getOrDefault(nums[i], 0);
            count++;
            vals.put(nums[i], count);
        }

        int amount = 0;
        
        for(Map.Entry<Integer, Integer> num : vals.entrySet()){
            int number = num.getValue();
            if(number > amount){
                amount = number;
            }
        }
        int key = 0;
        for(Map.Entry<Integer, Integer> num : vals.entrySet()){
            if(amount == num.getValue()){
                key = num.getKey();
            }
        }

        return key;
    }
}