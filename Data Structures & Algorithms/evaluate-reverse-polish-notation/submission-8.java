class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+")){
                res = stack.pop() + stack.pop();
                stack.push(res);
            }else if(tokens[i].equals("-")){
                res = (0 - stack.pop()) + stack.pop();
                stack.push(res);
            }else if(tokens[i].equals("*")){
                res = stack.pop() * stack.pop();
                stack.push(res);
            }else if(tokens[i].equals("/")){
                int quotient1 = stack.pop();
                int quotient2 = stack.pop();
                res = quotient2 / quotient1;
                stack.push(res);
            }else{
                res = Integer.parseInt(tokens[i]);
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return res;
    }
}
