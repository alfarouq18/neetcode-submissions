class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        int n = nums.length;
        int l = 0; 
        int r = 0;
        int[] output = new int[n - k + 1];

        while(r < n){
            while(!q.isEmpty() && nums[q.peekLast()] < nums[r]){
                q.pollLast();
            }
            q.addLast(r);
            if(q.peekFirst() < l){
                q.pollFirst();
            }
            if(r >= k - 1){
                output[l] = nums[q.peekFirst()];
                l++;
            }
            r++;
        }
        return output;
    }
}
