class Solution {
    public String minWindow(String s, String t) {
        
        Map<Character, Integer> need = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            need.put(t.charAt(i), need.getOrDefault(t.charAt(i), 0) + 1);
        }

        int l = 0;
        int needCount = need.size();
        int haveCount = 0;
        int resCount = Integer.MAX_VALUE;
        int[] res = {-1, -1};
        Map<Character, Integer> have = new HashMap<>();
        

        for(int r = 0; r < s.length(); r++){
            char rChar = s.charAt(r);
            have.put(rChar, have.getOrDefault(rChar, 0) + 1);
            if(need.containsKey(rChar) && need.get(rChar).equals(have.get(rChar))){
                haveCount++;
            }

            while(haveCount == needCount){
                if(r - l + 1 < resCount){
                    resCount = r - l + 1;
                    res[0] = l;
                    res[1] = r;
                }
                char lChar = s.charAt(l);
                have.put(lChar, have.get(lChar) - 1);
                if(need.containsKey(lChar) && have.get(lChar) < need.get(lChar)){
                    haveCount--;
                }
                l++;
            }
        }
        return resCount == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1]+1);
        

    }
}
