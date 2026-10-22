class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;
        int m = matrix.length;
        int n = matrix[0].length;
        int high=m-1;
        if(target<matrix[0][0] || target>matrix[m-1][n-1]){
        return false;
        }
        while(low<high){
        int mid=low+(high-low)/2;
        if(target>matrix[mid][n-1]){
             low = mid + 1;
        }
        else{
            high = mid;
        }
        if(target==matrix[mid][n-1]){
            return true;
        }
        }
        int collow = 0;
        int colhigh = n - 1;
        while(collow<=colhigh){
        int colmid = collow + (colhigh - collow) / 2;
        if (target > matrix[low][colmid]) {
        collow = colmid + 1;
        } 
        else if (target < matrix[low][colmid]) {
        colhigh=colmid-1;
        } 
        else{
        return true;
        }
        }
        return false;
    }
}
