class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> count = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
        }

        Map<Character, Integer> count1 = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            count1.put(t.charAt(i), count1.getOrDefault(t.charAt(i), 0) + 1);
        }

        if(count.equals(count1)){
            return true;
        }
        return false;

    }
}
