class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }

        Set<Integer> count1 = count.keySet();

        ArrayList<Integer> res = new ArrayList<>(count1);

        Collections.sort(res, (a, b) -> count.get(a) - count.get(b));

        int r = res.size() - 1;
        int l = 0;
        int[] actRes = new int[k];
        for(int i = k; i > 0; i--){
            actRes[l] = res.get(r);
            r--;
            l++;
        }
        return actRes;
    }
}