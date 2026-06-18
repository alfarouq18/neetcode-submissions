public class Solution {

    public string Encode(IList<string> strs) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strs.Count; i++){
            sb.Append(strs[i].Length);
            sb.Append('#');
            sb.Append(strs[i]);
        }
        return sb.ToString();
    }

    public List<string> Decode(string s) {
        List<string> res = new List<string>();
        int index = 0;
        while(index < s.Length){
            int j = index;
            while(s[j] != '#'){
                j++;
            }
            int wordLength = int.Parse(s.Substring(index, j - index));
            index = j + 1;
            string word = s.Substring(index, wordLength);
            index += wordLength;
            res.Add(word);
        }
        return res;
   }
}
