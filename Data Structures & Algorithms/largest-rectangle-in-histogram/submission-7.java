class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack<>();

        int res = 0;

        for(int i = 0; i < heights.length; i++){
            int index = i;
            int[] arr = new int[2];
            while(!stack.isEmpty() && stack.peek()[1] > heights[i]){
                res = Math.max(stack.peek()[1] * (i - stack.peek()[0]), res);
                index = stack.pop()[0];
            }
            arr[0] = index;
            arr[1] = heights[i];

            stack.push(arr);
        }

        while(!stack.isEmpty()){
            int[] popped = stack.pop();

            res = Math.max(((heights.length) - popped[0]) * popped[1], res);
        }

        return res;


    }
}
