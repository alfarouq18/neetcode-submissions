class Solution {
    public boolean isPalindrome(String s) {
        String palindrome = "";

        for(int i = s.length(); i > 0; i--){
            if(Character.isLetterOrDigit(s.charAt(i-1))){
                palindrome += s.substring(i-1, i);
            }
        }
        String palindrome2 = "";
        for(int i = palindrome.length(); i > 0; i--){
            if(Character.isLetterOrDigit(palindrome.charAt(i-1))){
                palindrome2 += palindrome.substring(i-1, i);
            }
        }
        String t = palindrome.toLowerCase();
        String x = palindrome2.toLowerCase();
        if(t.equals(x)){
            return true;
        }
        
        return false;
    }
}
