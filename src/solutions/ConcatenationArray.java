package solutions;

public class ConcatenationArray {

  /*
      Given an integer array nums of length n, you want to create an array ans of length 2n
      where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
      Specifically, ans is the concatenation of two nums arrays.Return the array ans.

      Example 1:
      ------------------------------
      ------------------------------
      Input: nums = [1,2,1]
      Output: [1,2,1,1,2,1]
      Explanation: The array ans is formed as follows:
      - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
      - ans = [1,2,1,1,2,1]
      ------------------------------

      Example 2:
      ------------------------------
      ------------------------------
      Input: nums = [1,3,2,1]
      Output: [1,3,2,1,1,3,2,1]
      Explanation: The array ans is formed as follows:
      - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
      - ans = [1,3,2,1,1,3,2,1]
      ------------------------------
      ------------------------------
      ------------------------------

      Constraints:
      n == nums.length
      1 <= n <= 1000
      1 <= nums[i] <= 1000
   */

  // Runtime : 2ms, Memory : 46MB.
  /** primary thoughtful process 1st approach.*/
  public int[] getConcatenation(int[] nums) {

    if (nums.length == 0) {
      return nums;
    }

    int j = 0;
    int[] test = new int[2 * nums.length];

    for (int i = 0; i < test.length; i++) {


      if (nums.length-1 < i) {
        test[i] = nums[j];
        j++;
      } else {
        test[i] = nums[i];
      }
    }


    for (int i = 0; i < test.length; i++) {
      System.out.println(test[i]);
    }
    return test;
  }


  // Runtime : 0ms, Memory : 46MB.
  /** best solution.*/
  public int[] bestSolutions(int[] nums) {
    int[] ans = new int[nums.length * 2];
    System.arraycopy(nums, 0, ans, 0, nums.length);
    System.arraycopy(nums, 0, ans, nums.length, nums.length);
    return ans;
  }

  // Runtime : 1ms, Memory : 46MB.
  /** best solution.*/
  public int[] bestSolutionsV2(int[] nums) {
    int[] arr = new int[2 * nums.length];
    for (int i = 0; i < nums.length; i++) {
      arr[i] = nums[i];
      arr[i + nums.length] = nums[i];
    }
    return arr;
  }

}
