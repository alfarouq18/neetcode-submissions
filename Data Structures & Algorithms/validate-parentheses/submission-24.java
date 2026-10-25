class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false;
        }
        char[] charArr = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] == '{' || charArr[i] == '[' || charArr[i] == '('){
                stack.push(charArr[i]);
            }
            else if(!stack.isEmpty()){
                if(charArr[i] == '}'){
                    if(stack.peek() != '{'){
                        return false;
                    }
                    stack.pop();
                }else if(charArr[i] == ']'){
                    if(stack.peek() != '['){
                        return false;
                    }
                    stack.pop();
                }else{
                    if(stack.peek() != '('){
                        return false;
                    }
                    stack.pop();
                }
            }else{
                return false;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
