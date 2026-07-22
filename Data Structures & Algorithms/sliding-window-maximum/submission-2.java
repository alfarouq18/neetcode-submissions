class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> q = new ArrayDeque<>();
        int[] output = new int[n - k + 1];

        int l = 0;
        int r = 0;

        while(r < n){
            while(!q.isEmpty() && nums[r] > nums[q.peekLast()]){
                q.pollLast();
            }
            q.addLast(r);

            if(q.peekFirst() < l){
                q.pollFirst();
            }
            if((r + 1)  >= k){
                output[l] = nums[q.getFirst()];
                l++;
            }
            r++;
        }
        return output;
    }
}
