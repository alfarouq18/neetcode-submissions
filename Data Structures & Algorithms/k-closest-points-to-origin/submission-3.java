class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(b[0] * b[0] + b[1] * b[1], a[0] * a[0] + a[1] * a[1]));

        for(int i = 0; i < points.length; i++){
            queue.offer(points[i]);
            if(queue.size() > k){
                queue.poll();
            }
        }

        int[][] res = new int[k][2];
        for(int i = 0; i < k; i++){
            res[i] = queue.poll();
        }

        return res;


    }
}
