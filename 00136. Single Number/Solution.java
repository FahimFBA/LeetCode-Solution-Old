// Using Bit manipulation
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0; // initialization
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}