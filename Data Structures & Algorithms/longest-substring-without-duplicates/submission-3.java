class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int res = 0;

        Set<Character> charSet = new HashSet<>();

        while(r < s.length()){
            while(charSet.contains(s.charAt(r))){
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
            r++;
        }
        return res;
    

    }
}
