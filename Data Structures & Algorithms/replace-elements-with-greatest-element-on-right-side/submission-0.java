class Solution {
    public int[] replaceElements(int[] arr) {
        int rightSuffix = -1;
        int[] ans = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--){
            ans[i] = rightSuffix;
            rightSuffix = Math.max(rightSuffix, arr[i]);
        }
        return ans;
    }
}