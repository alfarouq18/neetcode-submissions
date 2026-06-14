public class Solution {
    public List<List<string>> GroupAnagrams(string[] strs) {
        var map = new Dictionary<string, List<string>>();
        foreach(string s in strs){
            int[] arr = new int[26];
            for(int i = 0; i < s.Length; i++){
                arr[s[i] - 'a']++;
            }
            string key = string.Join(",", arr);
            if(!map.ContainsKey(key)){
                map[key] = new List<string>();
            }
            map[key].Add(s);
        }
        return map.Values.ToList<List<string>>();
    }
}
