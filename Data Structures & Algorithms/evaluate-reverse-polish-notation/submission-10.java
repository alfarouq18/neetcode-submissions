class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for(String c : tokens){
            if(c.equals("+") || c.equals("-") || c.equals("/") || c.equals("*")){
                if(c.equals("+")){
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2 + num1);
                }
                else if(c.equals("-")){
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2 - num1);
                }
                else if(c.equals("*")){
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2 * num1);
                }
                else{
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2 / num1);
                }
            }else{
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.peek();


    }
}
