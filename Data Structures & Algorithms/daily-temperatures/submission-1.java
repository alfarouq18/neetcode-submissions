class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] output = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int index = stack.pop();
                int diff = i - index;
                output[index] = diff;
            }
            stack.push(i);
        }
        return output;

    }
}
