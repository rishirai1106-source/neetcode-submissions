class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k=s1.length();
        if(k>s2.length()){
        return false;
        }
        HashMap<Character,Integer> hm=new HashMap<>();
        HashMap<Character,Integer> window=new HashMap<>();
        for(int i=0;i<k;i++){
            char ch=s1.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int j=0;j<k;j++){
            char ch=s2.charAt(j);
            window.put(ch,window.getOrDefault(ch,0)+1);
        }
        if(hm.equals(window)){
            return true;
        }
          int i = 0;

        // Slide window
        for (int j = k; j < s2.length(); j++) {

            char outgoing = s2.charAt(i);

            window.put(outgoing, window.get(outgoing) - 1);

            if (window.get(outgoing) == 0) {
                window.remove(outgoing);
            }

            char incoming = s2.charAt(j);

            window.put(incoming,
                window.getOrDefault(incoming, 0) + 1);

            i++;

            if (hm.equals(window)) return true;
        }

        return false;
    }
}
