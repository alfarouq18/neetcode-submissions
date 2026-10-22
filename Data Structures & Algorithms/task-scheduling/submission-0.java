class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        int[] arr = new int[26];

        for(int i = 0; i < tasks.length; i++){
            arr[tasks[i] - 'A']++;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                queue.offer(arr[i]);
            }
        }

        int time = 0;
        Queue<int[]> pairs = new LinkedList<>();

        while(!queue.isEmpty() || !pairs.isEmpty()){
            time++;
            if(!queue.isEmpty()){
                int count = queue.poll();
                count--;
                if(count > 0){
                    pairs.offer(new int[]{count, time + n});
                }
            }

            if(!pairs.isEmpty() && pairs.peek()[1] == time){
                queue.offer(pairs.poll()[0]);
            }
        }

        return time;

    }
}
