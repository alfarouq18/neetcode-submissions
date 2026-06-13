class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while(l < r){
            while(l < r && !alphaNum(s.charAt(l))){
                l++;
            }
            while(r > l && !alphaNum(s.charAt(r))){
                r--;
            }

            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public boolean alphaNum(char s){
        if(s >= 'A' && s <= 'Z'
        || s >= 'a' && s <= 'z'
        || s >= '0' && s <= '9'){
            return true;
        }
        return false;
    }
}
