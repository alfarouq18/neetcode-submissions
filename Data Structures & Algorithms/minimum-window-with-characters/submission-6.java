class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> need = new HashMap<>();

        for(int i = 0; i < t.length(); i++){
            need.put(t.charAt(i), need.getOrDefault(t.charAt(i), 0)+1);
        }
        Map<Character, Integer> have = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            have.put(t.charAt(i), 0);
        }

        int needCount = need.size();
        int haveCount = 0;
        int minCount = Integer.MAX_VALUE;
        String res = "";

        int l = 0;
        for(int r = 0; r < s.length(); r++){
            if(need.containsKey(s.charAt(r))){
                have.put(s.charAt(r), have.getOrDefault(s.charAt(r), 0)+1);
                if(have.get(s.charAt(r)).equals(need.get(s.charAt(r)))){
                    haveCount++;
                }
            }
            while(haveCount == needCount){
                if(have.containsKey(s.charAt(l))){
                    have.put(s.charAt(l), have.get(s.charAt(l))-1);
                    if(!(have.get(s.charAt(l)) >= need.get(s.charAt(l)))){
                        haveCount--;
                    }
                    int len = r - l + 1;
                if(minCount > len){
                    res = s.substring(l, r + 1);
                }
                minCount = Math.min(minCount, len);
                }
                l++;
            }
        }
        return res;


    }
}
