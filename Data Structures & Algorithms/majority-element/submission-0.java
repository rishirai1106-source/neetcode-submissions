class Solution {
    public int majorityElement(int[] nums) {
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            int count = 0; // ✅ reset count for each element
            for (int j = 0; j < N; j++) {
                if (nums[j] == nums[i]) {
                    count++; // ✅ count frequency of nums[i]
                }
            }
            if (count > N / 2) {
                return nums[i]; // ✅ return the element, not the count
            }
        }
        return -1; // ✅ required for compilation
    }
}