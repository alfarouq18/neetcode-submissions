public class Solution {
    public int CharacterReplacement(string s, int k) {
        HashSet<char> set = new HashSet<char>(s);

        for(int i = 0; i < s.Length; i++){
            set.Add(s[i]);
        }
        int max = 0;
        foreach(char c in set){
            int count = 0;
            int l = 0;
            for(int r = 0; r < s.Length; r++){
                if(s[r] == c){
                    count++;
                }

                while((r - l) + 1 - count > k){
                    if(s[l] == c){
                        count--;
                    }
                    l++;
                }
                max = Math.Max(r - l + 1, max);
            }
        }
        return max;
    }
}
