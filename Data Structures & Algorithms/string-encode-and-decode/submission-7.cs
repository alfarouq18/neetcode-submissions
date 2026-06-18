public class Solution {

    public string Encode(IList<string> strs) {
        StringBuilder sb = new StringBuilder("");
        foreach(string i in strs){
            sb.Append(i.Length);
            sb.Append("#");
            sb.Append(i);
        }
        return sb.ToString();
    }

    public List<string> Decode(string s) {
        int index = 0;
        List<string> res = new List<string>();
        while(index < s.Length){
            int j = index;
            while(s[j] != '#'){
                j++;
            }
            int wordLength = int.Parse(s.Substring(index, j-index));
            index = j + 1;
            string word = s.Substring(index, wordLength);
            index += wordLength;
            res.Add(word);
        }
        return res;
   }
}
