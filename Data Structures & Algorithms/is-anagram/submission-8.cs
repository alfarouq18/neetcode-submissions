public class Solution {
    public bool IsAnagram(string s, string t) {
        if(s.Length != t.Length){
            return false;
        }
        Dictionary<char, int> freq = new Dictionary<char, int>();
        for(int i = 0; i < s.Length; i++){
            freq[s[i]] = freq.GetValueOrDefault(s[i], 0) + 1;
        }
        Dictionary<char, int> freq1 = new Dictionary<char, int>();
        for(int i = 0; i < t.Length; i++){
            freq1[t[i]] = freq1.GetValueOrDefault(t[i], 0) + 1;
        }
        return (freq.Count == freq1.Count) && !freq.Except(freq1).Any();
    }
}
