class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;

        Set<Character> letters = new HashSet<>();
        int max = 0;

        for(int r = 0; r < s.length(); r++){
            while(letters.contains(s.charAt(r))){
                letters.remove(s.charAt(l));
                l++;
            }
            letters.add(s.charAt(r));
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
