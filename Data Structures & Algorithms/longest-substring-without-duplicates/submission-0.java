class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> hm = new HashSet<>();

        int i = 0;
        int max = 0;

        for (int j = 0; j < s.length(); j++) {

            while (hm.contains(s.charAt(j))) {
                hm.remove(s.charAt(i));
                i++;
            }

            hm.add(s.charAt(j));

            max = Math.max(max, j - i + 1);
        }

        return max;
    }
}