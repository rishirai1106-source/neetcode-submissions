class Solution {
    public int characterReplacement(String s, int k) {
    int i=0;
    int[] arr=new int[26];
    int maxfrequency=0;
    int ans = 0;
    for(int j=0;j<s.length();j++){
    int index=s.charAt(j)-'A';
    arr[index]++;
    maxfrequency=Math.max(maxfrequency,arr[index]);
    int window=j-i+1;
    if(window-maxfrequency>k){
    arr[s.charAt(i) - 'A']--;
    i++;
    }
    ans = Math.max(ans, j - i + 1);
    }
    return ans;
    }
}
