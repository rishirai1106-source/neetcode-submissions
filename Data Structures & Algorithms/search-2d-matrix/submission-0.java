class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] row = searchRow(matrix, target);
        if(row.length == 0) {
            return false;
        }
        return binarySearch(row, target);
    }

    private int[] searchRow(int[][] nums, int target) {
        int begin = 0;
        int end = nums.length - 1;
        int middle;
        int[] res;

        while (begin <= end) {
            middle = (end + begin) / 2;
            res = nums[middle];
            if(target >= res[0] && target <= res[res.length - 1]) {
                return res;
            } else {
                if(res[res.length - 1] > target) {
                    end = middle - 1;
                } else {
                    begin = middle + 1;
                }
            }
        }

        return new int[0];
    }

    private boolean binarySearch(int[] nums, int target)  {
        int begin = 0;
        int end = nums.length - 1;
        int middle;
        int res;

        while (begin <= end) {
            middle = (end + begin) / 2;
            res = nums[middle];
            if(target == res) {
                return true;
            } else {
                if(res > target) {
                    end = middle - 1;
                } else {
                    begin = middle + 1;
                }
            }
        }

        return false;
    }
}