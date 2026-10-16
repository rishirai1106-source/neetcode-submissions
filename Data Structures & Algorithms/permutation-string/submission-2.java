class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k=s1.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        HashMap<Character,Integer> window=new HashMap<>();
        if(k>s2.length()){
        return false;
        }
        for(int i=0;i<k;i++){
        Character ch=s1.charAt(i);
        hm.put(ch,hm.getOrDefault(ch, 0)+1);
        }
        for(int j=0;j<k;j++){
        Character ch=s2.charAt(j);
        window.put(ch,window.getOrDefault(ch, 0)+1);
        }
        int i=0;
        if(hm.equals(window)){
            return true;
        }
        for(int j=k;j<s2.length();j++){
        Character out=s2.charAt(i);
        window.put(out,window.get(out)-1);
        if (window.get(out) == 0) {
                window.remove(out);
            }
        Character in=s2.charAt(j);
        window.put(in,window.getOrDefault(in, 0)+1); 
        i++;
        if (hm.equals(window)) return true;
        }
        return false;

    }
}
