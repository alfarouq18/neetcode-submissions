class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> have = new HashMap<>();

        for(int i = 0; i < t.length(); i++){
            need.put(t.charAt(i), need.getOrDefault(t.charAt(i), 0) + 1);
        }

        int l = 0;
        int resCount = Integer.MAX_VALUE;
        int[] res = {-1, -1};
        int haveCount = 0;
        int needCount = need.size();
        
        for(int r = 0; r < s.length(); r++){
            char sCharRight = s.charAt(r);
            have.put(sCharRight, have.getOrDefault(sCharRight, 0) + 1);

            if(need.containsKey(sCharRight) && have.get(sCharRight).equals(need.get(sCharRight))){
                haveCount++;
            }

            while(haveCount == needCount){
                if(r - l + 1 < resCount){
                    res[0] = l;
                    res[1] = r;
                    resCount = r - l + 1;
                }
                char sCharLeft = s.charAt(l);
                have.put(sCharLeft, have.get(sCharLeft) - 1);
                if(need.containsKey(sCharLeft) && have.get(sCharLeft) < need.get(sCharLeft)){
                    haveCount--;
                }
                l++;
            }
        }
        return resCount == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);  
    }
}
