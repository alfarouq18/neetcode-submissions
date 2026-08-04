class Solution {
    public int trap(int[] height) {
     int l = 0;
     int r = height.length - 1;

     int lMax = 0;
     int rMax = 0;

     int res = 0;

     while(l < r){
        if(height[l] < height[r]){
            int sum = lMax - height[l];
            if(sum < 0){
                sum = 0;
            }
            res += sum;
            lMax = Math.max(lMax, height[l]);
            l++;
        }else{
            int sum = rMax - height[r];
            if(sum < 0){
                sum = 0;
            }

            res += sum;
            
            rMax = Math.max(rMax, height[r]);
            r--;

        }
     }
     return res;   
    }
}
