class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        Map<Character, Integer> count1 = new HashMap<>();
        for(int i = 0; i < 26; i++){
            int num = 'a' + i;
            char tempChar = (char) num;
            count1.put(tempChar, 0);
        }
        for(int i = 0; i < s1.length(); i++){
            count1.put(s1.charAt(i), count1.get(s1.charAt(i)) + 1);
        }

        Map<Character, Integer> count2 = new HashMap<>();
        for(int i = 0; i < 26; i++){
            int num = 'a' + i;
            char tempChar = (char) num;
            count2.put(tempChar, 0);
        }

        int l = 0;
        int r = s1.length() - 1;
        while(r < s2.length()){
            for(int i = 0; i < 26; i++) count2.put((char)('a' + i), 0);
            for(int i = l; i <= r; i++){
                 count2.put(s2.charAt(i), count2.get(s2.charAt(i)) + 1);   
            }
            if(!count1.equals(count2)){
                l++;
                r++;
            }else{
                return true;
            }
        }
        return false;

    }
}