class KthLargest {

    PriorityQueue<Integer> minHeap;
    int count;
    int max;


    public KthLargest(int k, int[] nums) {
        count = 0;
        max = k;

        minHeap = new PriorityQueue<>();

        for(int i = 0; i < nums.length; i++){
            this.add(nums[i]);
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);
        if(minHeap.size() > max){
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
