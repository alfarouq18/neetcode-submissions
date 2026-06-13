class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] charArray = s2.toCharArray();
        int[] count = new int[26];
        for(int i = 0; i < s1.length(); i++){
            count[s1.charAt(i) - 'a']++;
        }
        int l = 0;
        for(int r = s1.length() - 1; r < s2.length(); r++){
            int[] count2 = new int[26];
            for(int i = l; i < r + 1; i++){
                count2[s2.charAt(i) - 'a']++;
            }
            if(Arrays.equals(count, count2)){
                return true;
            }
            l++;
        }
        return false;
    }
}
