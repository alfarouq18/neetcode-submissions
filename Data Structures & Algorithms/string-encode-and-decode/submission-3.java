class Solution {

    public String encode(List<String> strs) {
        String res = "";

        for(int i = 0; i < strs.size(); i++){
            res += strs.get(i).length() + "#" + strs.get(i);
        }
        return res;
    }

    public List<String> decode(String str) {

        int index = 0;
        ArrayList<String> res = new ArrayList<>();
        while(index < str.length()){
            int j = index;

            while(str.charAt(j) != '#'){
                j++;
            }

            int wordLength = Integer.parseInt(str.substring(index, j));

            index = j + 1;

            String word = str.substring(index, index + wordLength);

            res.add(word);

            index += wordLength;


        }
        return res;
    }
}
