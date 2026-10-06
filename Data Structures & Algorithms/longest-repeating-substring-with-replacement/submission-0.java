class Solution {
    //To track frequency of elements in the sliding window
    Map<Character, Integer> map = new HashMap<>();

    public int characterReplacement(String s, int k) {
        //edge case handling
         if (s.length() == 0) {
            return 0;
        }

        int start = 0; //start pointer of sliding window
        int end = 0;//end pointer of sliding window
        int maxLen = 0; //tracker window length found of Longest Repeating Characters with allowed replacements

        //keep looping until window reaches the end
        while (end<s.length()){
            addToMap(s.charAt(end));  //add element to map
            end++;  //increase window length by 1 since we tracked one element in the map
            int window_size = end - start; //window size calculated
            int current_max = maxInMap();  //frequency of the element with mx occurence
            int char_to_change = window_size - current_max;
            if (char_to_change>k){
                //reduce window size as current window needs more characters replaced than the allowed number k
                removeFromMap(s.charAt(start));  
                start++;
            }else{maxLen = (window_size>maxLen)?window_size:maxLen; 
            }
        }
        return maxLen;
    }

    //return highest frequency among all eelements frequency
    public int maxInMap() {
        int max = 0;
        for (int count : map.values()) {
            max = Math.max(max, count);
        }
        return max;
    }

    //updates map with frequency
    public void addToMap(Character key) {
        map.put(key, map.getOrDefault(key, 0) + 1);
    }

    // removes element's frequency
    public void removeFromMap(Character key) {
        int count = map.get(key);
        if (count == 1) {
            map.remove(key);
        } else {
            map.put(key, count - 1);
        }
    }
}