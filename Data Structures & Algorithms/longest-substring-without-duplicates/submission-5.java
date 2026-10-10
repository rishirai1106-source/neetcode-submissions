class Solution {
    public int lengthOfLongestSubstring(String s) {
      int i=0;
      int max=0;
      HashSet<Character> hs=new HashSet<>();
      for(int j=0;j<s.length();j++){
       while(hs.contains(s.charAt(j))){
      hs.remove(s.charAt(i));
        i++;
      }
      hs.add(s.charAt(j));
      max=Math.max(max,j-i+1);
      }  
      return max;
    }
}
