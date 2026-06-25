public class Solution {
    public int Trap(int[] height) {
        int[] maxLeft = new int[height.Length];
        int max = 0;
        for(int i = 0; i < height.Length; i++){
            max = Math.Max(height[i], max);
            maxLeft[i] = max;
        }

        max = 0;
        int[] maxRight = new int[height.Length];
        for(int i = height.Length-1; i >= 0; i--){
            max = Math.Max(height[i], max);
            maxRight[i] = max;
        }
        int res = 0;
        for(int i = 0; i < height.Length; i++){
            int minHeight = Math.Min(maxLeft[i], maxRight[i]);
            int sum = minHeight - height[i];
            if(sum < 0){
                sum = 0;
            }
            res += sum;
        }
        return res;
    }
}
