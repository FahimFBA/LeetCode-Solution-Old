import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); // sorting the entire int array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) // will check the value with the previous value whether they both are the same
                                        // or not
                return true; // if the value and the previous value are both the same then return true as the
                             // question suggests
        }
        return false; // otherwise return false as the question suggests
    }
}