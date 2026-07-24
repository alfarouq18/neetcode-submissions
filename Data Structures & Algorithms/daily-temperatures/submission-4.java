class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            res[i] = 0;
        }

        Stack<Integer> indexes = new Stack<>();

        for(int i = 0; i < temperatures.length; i++){
            while(!indexes.isEmpty() && temperatures[i] > temperatures[indexes.peek()]){
                res[indexes.peek()] = i - indexes.pop();
            }
            indexes.push(i);
        }
        return res;
    }
}
