public class Solution {
    public int LengthOfLongestSubstring(string s) {
        HashSet<int> set = new HashSet<int>();

        int l = 0;
        int max = 0;

        for(int r = 0; r < s.Length; r++){
            while(set.Contains(s[r])){
                set.Remove(s[l]);
                l++;
            }
            max = Math.Max(max, r - l + 1);
            set.Add(s[r]);
        }
        return max;
    }
}
