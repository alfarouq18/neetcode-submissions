class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();

        char[] c = s.toCharArray();
        int l = 0;

        int max = 0;

        for(int r = 0; r < c.length; r++){
            while(charSet.contains(c[r])){
                charSet.remove(c[l]);
                l++;
            }
            charSet.add(c[r]);

            max = Math.max(max, r - l + 1);

        }

        return max;
    }
}
