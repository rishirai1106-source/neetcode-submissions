class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        PriorityQueue<int[]> pq=new PriorityQueue<>( (x,y)->{
            if(x[0]!=y[0])
                return y[0]-x[0];
            return x[1]-y[1];
        });
        for(int no:nums){
            if(hm.containsKey(no)){
                hm.put(no,hm.get(no)+1);
            }else{
                hm.put(no,1);
            }
        }
       for(int i=0; i<nums.length; i++){
         if(hm.get(nums[i])>0){
            pq.add(new int[]{hm.get(nums[i]),nums[i]});
            hm.put(nums[i],0);
         }
       }
       int a[]=new int[k]; int x=0;
       while(k!=0){
         int[] pair=pq.poll();
         a[x++]=pair[1];
         k--;
       }
       return a;
        
    }
}
