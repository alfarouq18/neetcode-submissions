class Solution {
    public int[][] merge(int[][] intervals) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        Queue<int[]> inertQueue = new LinkedList<>();

        for(int i = 0; i < intervals.length; i++){
            queue.offer(intervals[i]);
        }

        while(queue.size() != 1){
            int[] interval1 = queue.poll();
            int[] interval2 = queue.poll();
            if(interval1[1] >= interval2[0]){
                int[] entry2 = {interval1[0], Math.max(interval2[1], interval1[1])};
                queue.offer(entry2);
            }else{
                inertQueue.offer(interval1);
                queue.offer(interval2);
            }
        }

        inertQueue.offer(queue.poll());

        int[][] res = new int[inertQueue.size()][2];
        int i = 0;
        while(!inertQueue.isEmpty()){
            res[i] = inertQueue.poll();
            i++;
        }

        return res;
    }
}
