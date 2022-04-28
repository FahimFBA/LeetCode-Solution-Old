import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int arraySize = nums.length;
        for (int i = 0; i < arraySize; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return nums[arraySize - 1] + 1;
    }
}