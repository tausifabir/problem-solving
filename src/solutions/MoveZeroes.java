package solutions;

import java.util.Arrays;

public class MoveZeroes {

    /*
      Given an integer array nums, move all 0's to the end of it
      while maintaining the relative order of the non-zero elements.
      Note that you must do this in-place without making a copy of the array.

      Example 1:
      ------------------------------
      ------------------------------
      Input: nums = [0,1,0,3,12]
      Output: [1,3,12,0,0]
      ------------------------------

      Example 2:
      ------------------------------
      ------------------------------
      Input: nums = [0]
      Output: [0]
      ------------------------------
      ------------------------------


      Example 3:
      ------------------------------
      ------------------------------
      Input: nums = [0,1,0]
      Output: [1,0,0]
      ------------------------------
      ------------------------------

      Example 4:
      ------------------------------
      ------------------------------
      Input: nums = [2,1]
      Output: [2,1]
      ------------------------------
      ------------------------------

      Example 5:
      ------------------------------
      ------------------------------
      Input: nums = [4,2,4,0,0,3,0,5,1,0]
      Output: [4,2,4,3,5,1,0,0,0,0]
      ------------------------------
      ------------------------------

      Example 6:
      ------------------------------
      ------------------------------
      Input: nums = [0,1,5,0,12,9,0]
      Output:      [1,5,12,9,0,0,0]
      ------------------------------
      ------------------------------


      Constraints:
      ------------------------------
      ------------------------------
      1 <= nums.length <= 104
      -231 <= nums[i] <= 231 - 1
      ------------------------------
      Follow up: Could you minimize the total number of operations done?
   */


  // Runtime : 2ms, Memory : 46MB.
  /** primary thoughtful process 1st approach.*/
  public int[] movingZeroes(int[] nums) {


    if(nums.length ==0 || nums.length == 1) {
      return nums;
    }

    int nonZeroIndex = 0;
    int zeroIndex = 0;

    while (nonZeroIndex < nums.length) {
      if(nums[nonZeroIndex] != 0) {
        int tempNumber = nums[nonZeroIndex];
        nums[nonZeroIndex] = nums[zeroIndex];
        nums[zeroIndex] = tempNumber;
        nonZeroIndex++;
        zeroIndex++;
      }else {
        nonZeroIndex++;
      }
    }


    return nums;
  }




  // Runtime : 2ms, Memory : 46MB.
  /** space Efficient solution.*/
  public int[] movingZeroesV2(int[] nums) {

    // Start with the first position
    int insertPosition = 0;


    for (int i = 0; i < nums.length; i++) {
      // Fill all non-zero numbers
      if(nums[i] != 0) {
        nums[insertPosition] = nums[i];
        insertPosition++;
      }
    }

    while (insertPosition < nums.length) {
      // rest of the index will be filled with zero
     nums[insertPosition++] = 0;
    }


    return nums;
  }


  // Runtime : 1ms, Memory : 46MB.
  /** Best Run Time Solution.*/
  public int[] movingZeroesV3(int[] nums) {

    int size = nums.length;
    int j = 0;

    for (int i = 0; i < size; i++) {
      if (nums[i] != 0) {
        nums[j++] = nums[i];
      }
    }

    for (; j < size; j++) {
      nums[j] = 0;
    }

    return nums;
  }
}
