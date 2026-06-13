class Solution {
    public int lengthOfLongestSubstring(String s) {
       int l = 0;
       int res = 0;

       char[] characters = s.toCharArray();

       Set<Character> count = new HashSet<>();

       for(int r = 0; r < characters.length; r++){
        

        while(count.contains(characters[r])){
            count.remove(characters[l]);
            l++;
        }
        count.add(characters[r]);
        res = Math.max(res, r - l + 1);
       }
       return res;
    }
}
