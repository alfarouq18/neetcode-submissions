class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        char[] sCharArr = s.toCharArray();
        for(char c : sCharArr){
            if(c == '{' || c == '(' || c == '['){stack.push(c);}
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if(c == ')'){
                    if(stack.pop() != '('){return false;}
                }
                if(c == '}'){
                    if(stack.pop() != '{'){return false;}
                }
                if(c == ']'){
                    if(stack.pop() != '['){return false;}
                }
            } 
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
