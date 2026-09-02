class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int i,j;
        for(i=0;i<n;i++){
        for(j=n-1;j>=0;j--){
       if(i != j && nums[i] + nums[j] == target)
            return new int[]{i,j};
    }
}
       return new int[]{};
    }
}
