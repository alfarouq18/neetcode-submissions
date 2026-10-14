class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < stones.length; i++){
            maxHeap.offer(stones[i]);
        }

        int res = 0;

        while(!maxHeap.isEmpty() && maxHeap.size() != 1){
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();

            if(stone1 > stone2){
                maxHeap.offer(stone1 - stone2);
            }else if(stone2 > stone1){
                maxHeap.offer(stone2 - stone1);
            }
        }

        if(maxHeap.isEmpty()){
            res = 0;
        }else{
            res = maxHeap.peek();
        }
        
        return res;
    }
}
