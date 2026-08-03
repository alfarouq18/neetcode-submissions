class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>();

        int l = 0;

        int[] arr = new int[nums.length - k + 1];

        for(int r = 0; r < nums.length; r++){
            while(!q.isEmpty() && nums[q.getLast()] < nums[r]){
                q.pollLast();
            }
            q.offerLast(r);

            if(r - l + 1 >= k){
                arr[l] = nums[q.getFirst()];
                l++;
            }

            if(l > 0 && !q.isEmpty() && nums[q.getFirst()] == (nums[l - 1])){
                q.pollFirst();
            }
        }

        return arr;
    }
}
