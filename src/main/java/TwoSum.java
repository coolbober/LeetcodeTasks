public class TwoSum {

    /*
    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    Example:

    Given nums = [2, 7, 11, 15], target = 9,
    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].
     */

    public int[] twoSum(int[] nums, int target){
        int[] exit = {0, 0};
        point: {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = 1; j < nums.length; j++) {
                    if (target == nums[i] + nums[j] && i != j){
                        exit[0] = i;
                        exit[1] = j;
                     break point;
                    }
                }
            }
        }
        return exit;
    }
}
