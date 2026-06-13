class Solution {
    public String minWindow(String s, String t) {

        Map<Character, Integer> need = new HashMap<>();
        char[] sChar = s.toCharArray();
        for(int i = 0; i < t.length(); i++){
            need.put(t.charAt(i), need.getOrDefault(t.charAt(i), 0) + 1);
        }
        Map<Character, Integer> have = new HashMap<>();
        int needCount = need.size();
        int haveCount = 0;
        int l = 0;
        int[] res = {-1, -1};
        int resCount = Integer.MAX_VALUE;

        for(int r = 0; r < sChar.length; r++){
            have.put(sChar[r], have.getOrDefault(sChar[r], 0) + 1);
            if(need.containsKey(sChar[r]) && have.get(sChar[r]).equals(need.get(sChar[r]))){
                    haveCount++;
                }
            while(haveCount == needCount){
                if(r - l + 1 < resCount){
                    resCount = r - l + 1;
                    res[0] = l;
                    res[1] = r;
                }
                char leftChar = s.charAt(l);
                have.put(leftChar, have.get(leftChar) - 1);
                if(need.containsKey(leftChar) && have.get(leftChar) < need.get(leftChar)){
                        haveCount--;
                }
                l++;
            }
        }
        return resCount == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);

    }
}

