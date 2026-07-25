class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int l = 0;
       int r = matrix.length - 1;
       int colLength = matrix[0].length - 1;
       while(l <= r){
            int middle = (r - l) / 2 + l;

            if(matrix[middle][0] > target){
                r = middle - 1;
            }else if(matrix[middle][colLength] < target){
                l = middle + 1;
            }else{
                int lCount = 0;
                int rCount = colLength;
                while(lCount <= rCount){
                    int m = (rCount - lCount) / 2 + lCount;
                    if(matrix[middle][m] < target){
                        lCount = m + 1;
                    }else if(matrix[middle][m] > target){
                        rCount = m - 1;
                    }else{
                        return true;
                    }
                }
                return false;
            }
        
        }
        return false; 
    }
}
