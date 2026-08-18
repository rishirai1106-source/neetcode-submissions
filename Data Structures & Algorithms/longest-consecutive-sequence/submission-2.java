class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int length=0;
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        for(int i=0;i<n;i++){
           int count=0;
           int x=nums[i];
          if(!set.contains(x-1)){
            count++;
         while(set.contains(x+1)){
            count++;
            x++;
        }
        }
        length=Math.max(count, length); 
        } 
        return length;
    }
}
