class Solution {
    public boolean isValid(String s) {
        Stack<String> paren = new Stack<>();

        if(s.length() == 0){
            return true;
        }
        if(s.length() == 1){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            if(s.substring(i, i+1).equals("(")){
                paren.push("(");
            }
            else if(s.substring(i, i+1).equals(")")){
                if(paren.empty()){
                    return false;
                }
                else if(paren.peek().equals("(")){
                    paren.pop();
                }
                else{
                    return false;
                }
            }
            else if(s.substring(i, i+1).equals("{")){
                paren.push("{");
            }
            else if(s.substring(i, i+1).equals("}")){
                 if(paren.empty()){
                    return false;
                }
                else if(paren.peek().equals("{")){
                    paren.pop();
                }
                else{
                    return false;
                }
            }
            else if(s.substring(i, i+1).equals("[")){
                paren.push("[");
            }
            else if(s.substring(i, i+1).equals("]")){
                 if(paren.empty()){
                    return false;
                }
                else if(paren.peek().equals("[")){
                    paren.pop();
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
         if(paren.empty()){
            return true;
         }
         return false;
    }
}

