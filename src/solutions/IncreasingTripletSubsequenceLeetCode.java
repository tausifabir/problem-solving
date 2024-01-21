package solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class IncreasingTripletSubsequenceLeetCode {

  /*
      Given an integer array nums, return true
      if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k].
      If no such indices exists, return false.

      Example 1:
     ------------------------------
     ------------------------------
      * Input: nums = [1,2,3,4,5]
      * Output: true
      * Explanation: Any triplet where i < j < k is valid.
      -----------------------------------

      Example 2:
     ------------------------------
     ------------------------------
      * Input: nums = [5,4,3,2,1]
      * Output: false
      * Explanation: No triplet exists.
      ------------------------------------

      Example 3:
     ------------------------------
     ------------------------------
      * Input: nums = [2,1,5,0,4,6]
      * Output: true
      * Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
      ------------------------------------
    */

  //  Passed 66/83 Leet Code test cases
  /** increasingTripletBeginnerApproachV1. */
  public boolean increasingTripletBeginnerApproachV1(int[] nums) {

    HashMap<Integer, Integer> inputNumber = new HashMap<Integer, Integer>();

    for (int i = 0; i <= nums.length - 1; i++) {
      inputNumber.put(i, nums[i]);
    }



    for (int i = 0; i <= nums.length - 1; i++) {

      Integer firstNumber = inputNumber.get(i);

      if (firstNumber != null) {

        Integer secondNumber = inputNumber.get(i+1);

        if (secondNumber != null && firstNumber < secondNumber) {

          Integer thirdNumber = inputNumber.get(i + 2);

          if (thirdNumber != null
              && secondNumber < thirdNumber) {
            return true;
          }
        }
      }
    }

    return false;
  }


  //  Passed 70/83 Leet Code test cases
  /** increasingTripletBeginnerApproachV2. */
  public boolean increasingTripletBeginnerApproachV2(int[] nums) {

    HashMap<Integer, Integer> inputNumber = new HashMap<Integer, Integer>();
    int[] sortedNums = Arrays.copyOf(nums, nums.length);
    Arrays.sort(sortedNums);

    for (int i = 0; i <= sortedNums.length - 1; i++) {
      inputNumber.put(i, sortedNums[i]);
    }



    for (int i = 0; i <= sortedNums.length - 1; i++) {

      Integer firstNumber = inputNumber.get(i);

      if (firstNumber != null) {

        Integer secondNumber = inputNumber.get(i+1);

        if (secondNumber != null && firstNumber < secondNumber) {

          Integer thirdNumber = inputNumber.get(i + 2);

          if (thirdNumber != null
              && secondNumber < thirdNumber) {
            return true;
          }
        }
      }
    }

    return false;
  }
}
