

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }

        String[] array = new String[s.length()];

        for(int i = 0; i < s.length(); i++){

            array[i] = s.substring(i, i + 1);

        }
        String[] array2 = new String[t.length()];

        for(int i = 0; i < t.length(); i++){

            array2[i] = t.substring(i, i + 1);

        }

        Arrays.sort(array2);
        Arrays.sort(array);

        for(int i = 0; i < array.length; i++){
            if(!array[i].equals(array2[i])){
                return false;
            }
        }
        return true;



    }
}
