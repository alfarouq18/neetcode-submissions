class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> indices = new Stack<>();

        int[] output = new int[temperatures.length];
        for(int i = 0; i < output.length; i++){
            output[i] = 0;
        }

        for(int i = 0; i < temperatures.length; i++){
            while(!indices.isEmpty() && temperatures[indices.peek()] < temperatures[i]){
                int index = indices.pop();
                int res = i - index;
                output[index] = res;
            }
            indices.push(i);        
        }
        return output;
    }
}
