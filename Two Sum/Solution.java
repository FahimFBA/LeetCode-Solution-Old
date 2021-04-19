class Solution {
    public int[] twoSum(int[] nums, int target) {
        // outer loop
         for (int i = 0; i < nums.length; i++) {
             // inner loop
             for (int j = 0; j < nums.length; j++) {
                 // compare if not same number
                 if ( (i != j) && (nums[i] + nums[j] == target) ) {
                     return new int[]{i,j};
                 }
             }
         }
        // return empty int array (only if target not found)
         return new int[0];
     }
 }