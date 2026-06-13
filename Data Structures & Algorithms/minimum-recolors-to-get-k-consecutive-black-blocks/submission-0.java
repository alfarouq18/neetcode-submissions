class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l = 0;
        int r = k - 1;
        int res = blocks.length();

        while(r < blocks.length()){
            int count = 0;
            for(int i = l; i <= r; i++){
                if(blocks.charAt(i) == 'W'){
                    count++;
                }
            }
            res = Math.min(res, count);
            l++;
            r++;
        }
        return res;
    }
}