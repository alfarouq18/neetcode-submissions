class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();
        int res = 0;
        for(int i = 0; i < tokens.length; i++){
            String val = tokens[i];
            switch(val){
                case "+":
                    int sum1 = nums.pop();
                    int sum2 = nums.pop();
                    int sum = sum1 + sum2;
                    res = sum;
                    nums.push(sum);
                    break;
                case "-":
                    int diff1 = nums.pop();
                    int diff2 = nums.pop();
                    int diff = diff2 - diff1;
                    res = diff;
                    nums.push(diff);
                    break;
                case "*":
                    int product1 = nums.pop();
                    int product2 = nums.pop();
                    int product = product1 * product2;
                    res = product;
                    nums.push(product);
                    break;
                case "/":
                    int quotient1 = nums.pop();
                    int quotient2 = nums.pop();
                    int quotient = quotient2 / quotient1;
                    res = quotient;
                    nums.push(quotient);
                    break;
                default:
                    int num = Integer.parseInt(val);
                    res = num;
                    nums.push(num);
            }
        }
        return res;
    }
}
