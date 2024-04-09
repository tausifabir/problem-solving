package solutions;

public class TwoSum {

    /*
    Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution,
    and you may not use the same element twice.
    You can return the answer in any order.

      Example 1:
      ------------------------------
      ------------------------------
      Input: nums = [2,7,11,15], target = 9
      Output: [0,1]
      Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
      ------------------------------

      Example 2:
      ------------------------------
      ------------------------------
      Input: nums = [3,2,4], target = 6
      Output: [1,2]
      ------------------------------

      Example 3:
      ------------------------------
      ------------------------------
      Input: nums = [3,3], target = 6
      Output: [0,1]
      ------------------------------

      Constraints:
      ------------------------------
      ------------------------------
      2 <= nums.length <= 104
      -109 <= nums[i] <= 109
      -109 <= target <= 109
      Only one valid answer exists.
      ------------------------------

   */


  // Runtime : 45ms, Memory : 45MB.
  /** primary thoughtful process 1st approach.*/
  public int[] twoSum(int[] nums, int target) {

    int [] newArray = new int[2];

    int firstIndex = 0;
    int lastIndex = nums.length-1;

    while(firstIndex < nums.length) {
      for (int i = lastIndex; i > firstIndex; i--) {
        if(nums[firstIndex] + nums[i] == target) {
          newArray[0] = firstIndex;
          newArray[1] = i;
          return newArray;
        }
      }
      firstIndex++;
    }
    return newArray;
  }



  // Runtime : 0ms, Memory : 45MB.
  /** Best Efficient Solution V2.*/
  public int[] twoSumV2(int[] nums, int target) {
    for(int i=1;i<nums.length;i++){
      for(int j=i;j<nums.length;j++){
        if(nums[j] + nums[j-i] == target){
          return new int[]{j, j-i};
        }
      }
    }
    return null;
  }

}
