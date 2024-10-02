package solutions;

import java.util.*;

public class TopKFrequent {


/*
  Given an integer array nums and an integer k,
  return the k most frequent elements within the array.
  The test cases are generated such that the answer is always unique.

  You may return the output in any order.

    Example 1:
    ------------------------------
    ------------------------------
    Input: nums = [1,2,2,3,3,3], k = 2
    Output: [2,3]
    ------------------------------

    Example 2:
    ------------------------------
    ------------------------------
    Input: nums = [7,7], k = 1
    Output: [7]
    ------------------------------

    Constraints:
    ------------------------------
    ------------------------------
    1 <= nums.length <= 10^4.
    -1000 <= nums[i] <= 1000
    1 <= k <= number of distinct elements in nums.

  */

  public int[] topKFrequent(int[] nums, int k) {

    if (nums.length == 0) {
      return new int[0];
    }

    int [] returnArray = new int[k];
    HashMap<Integer, Integer>  givenUniqueNumber = new HashMap<>();


    for (int num : nums) {
      if(!givenUniqueNumber.containsKey(num)){
        givenUniqueNumber.put(num,0);
      }

    }

    for (int num : nums) {
      if(givenUniqueNumber.containsKey(num)) {
        givenUniqueNumber.put(num,givenUniqueNumber.get(num)+1);
      }
    }

    int index = 0;
    while (index < k) {
      returnArray [index] = givenUniqueNumber.get();
      index++;
    }

    return returnArray;
  }
}