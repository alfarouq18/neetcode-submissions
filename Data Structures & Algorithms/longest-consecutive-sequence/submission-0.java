class Solution {
    public int longestConsecutive(int[] nums) {
        Set numbers = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            numbers.add(nums[i]);
        }

        int longest = 0;

        for(int i = 0; i < nums.length; i++){
            if(!numbers.contains(nums[i] - 1)){
                int length = 0;

                while(numbers.contains(nums[i] + length)){
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;

    }
}
