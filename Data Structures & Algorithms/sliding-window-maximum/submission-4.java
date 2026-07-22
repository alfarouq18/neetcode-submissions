class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;

        Deque<Integer> queue = new ArrayDeque<>();

        int[] output = new int[n - k + 1];

        int l = 0;
        int r = 0;

        while(r < n){

            while(!queue.isEmpty() && nums[r] > nums[queue.getLast()]){
                queue.pollLast();
            }

            queue.add(r);

            if(queue.getFirst() < l){
                queue.pollFirst();
            }

            if(r + 1 >= k){
                output[l] = nums[queue.getFirst()];
                l++;
            }
            r++;
        }

        return output;

    }
}
