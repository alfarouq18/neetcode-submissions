class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }

        Set<String> set = new HashSet<>();
        int l = 0;
        char[] s1CharArr = s1.toCharArray();
        int[] arr = new int[26];

        for(int i = 0; i < s1.length(); i++){
            arr[s1CharArr[i] - 'a']++;
        }
        String ans = Arrays.toString(arr);

        char[] s2CharArr = s2.toCharArray();
        for(int r = s1.length() - 1; r < s2.length(); r++){
            int[] tempArr = new int[26];
            for(int i = l; i <= r; i++){
                tempArr[s2CharArr[i] - 'a']++;
            }
            String check = Arrays.toString(tempArr);
            set.add(check);
            l++;
        }
        return set.contains(ans);


    }
}
