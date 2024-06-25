package solutions;

import java.util.ArrayList;
import java.util.List;

public class ContainerWithMostWater {

   /*
      You are given an integer array height of length n.
      There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
      Find two lines that together with the x-axis form a container, such that the container contains the most water.
      Return the maximum amount of water a container can store.
      Notice that you may not slant the container.

      Example 1:
      ------------------------------
      ------------------------------
      Input: height = [1,8,6,2,5,4,8,3,7]
      Output: 49
      Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
      In this case, the max area of water (blue section) the container can contain is 49
      ------------------------------

      Example 2:
      ------------------------------
      ------------------------------
      Input: height = [1,1]
      Output: 1
      ------------------------------
      ------------------------------

      ------------------------------
      Constraints:
      ------------------------------
      ------------------------------
      n == height.length
      2 <= n <= 105
      0 <= height[i] <= 104
      ------------------------------
   */


  /** primary thoughtful process 1st approach.*/
  public int maxArea(int[] height) {

    int firstIndex = height[0];
    int LastIndex = height[height.length - 1];
    int maxArea = 0;

    while (firstIndex < LastIndex) {

      int firstWidth = firstIndex;
      int lastWidth = height[height.length - 1];
      while (firstWidth < lastWidth) {

        int tempMaxArea = height[firstWidth] * lastWidth;
        if(tempMaxArea> maxArea) {
          maxArea = tempMaxArea;
        }
        lastWidth--;
      }
      firstIndex++;
    }

    return maxArea;

  }

  public List<List<Integer>> threeSum() {

    int [] nums = {-1,0,1,2,-1,-4};

    //Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
    // such that i != j, i != k, and j != k,
    // and nums[i] + nums[j] + nums[k] == 0.

    // [[-1,-1,2],[-1,0,1]


    int firstIndex = nums[0];
    int lastIndex = nums[nums.length-1];

    while (firstIndex < lastIndex) {
      int leftNumber = nums[firstIndex];
      int rightNumber = nums[lastIndex];



    }

    List<List<Integer>> result = new ArrayList<>();
    return result;
  }

}
