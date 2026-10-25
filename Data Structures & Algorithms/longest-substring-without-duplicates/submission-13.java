class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;

        HashSet<Character> set = new HashSet<>();

        char[] charArray = s.toCharArray();

        int max = 0;

        for(int r = 0; r < charArray.length; r++){
            while(set.contains(charArray[r])){
                set.remove(charArray[l]);
                l++;
            }
            max = Math.max(max, r - l + 1);
            set.add(charArray[r]);
        }
        
        return max;
    }
}
