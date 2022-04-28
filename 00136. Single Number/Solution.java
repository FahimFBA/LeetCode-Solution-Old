import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        int arraySize = nums.length;
        int returnValue = nums[0];
        Arrays.sort(nums);
        if (arraySize == 1 || nums[0] != nums[1]) {
            return nums[0];
        } else {
            for (int i = 1; i < arraySize; i++) {
                if (nums[i - 1] != nums[i] && nums[i] != nums[i + 1]) {
                    returnValue = nums[i];
                    break;
                }
            }
        }
        return returnValue;
    }
}