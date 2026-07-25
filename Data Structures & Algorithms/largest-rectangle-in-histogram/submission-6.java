class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack<>();
        int max = 0;

        for(int i = 0; i < heights.length; i++){
            int[] pair = new int[2];
            pair[0] = i;
            pair[1] = heights[i];

            while(!stack.isEmpty() && heights[i] < stack.peek()[1]){
                int index = stack.peek()[0];
                int height = stack.pop()[1];
                max = Math.max(height * (i - index), max);
                pair[0] = index;
            }
            stack.push(pair);
        }
        while(!stack.isEmpty()){
            int[] popped = stack.pop();
            max = Math.max(popped[1] * (heights.length - popped[0]), max);
        }
        return max;
    }
}
 