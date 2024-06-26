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


  /**
   * primary thoughtful process 1st approach. Time Limit Exceeded.
   */
  public int maxArea(int[] height) {

    int firstIndex = 0;
    int LastIndex = height.length - 1;
    int maxArea = 0;

    while (firstIndex < LastIndex) {

      int firstWidth = firstIndex;
      int lastWidth = height.length - 1;

      while (firstWidth < lastWidth) {
        int width = lastWidth - firstIndex;
        int tempMaxArea = 0;
        if (height[lastWidth] < height[firstWidth]) {
          tempMaxArea = height[lastWidth] * width;
        } else {
          tempMaxArea = height[firstWidth] * width;
        }

        if (tempMaxArea > maxArea) {
          maxArea = tempMaxArea;
        }
        lastWidth--;
      }
      firstIndex++;
    }
    return maxArea;
  }


  /**
   * primary thoughtful process 2nd approach.
   */
  // Runtime : 3ms, Memory : 57MB.
  public int maxAreaV2(int[] height) {

    int firstIndex = 0;
    int LastIndex = height.length - 1;
    int maxArea = 0;

    while (firstIndex < LastIndex) {
      if (height[firstIndex] < height[LastIndex]) {
        maxArea = Math.max(maxArea, height[firstIndex] * (LastIndex - firstIndex));
        firstIndex++;
      } else {
        maxArea = Math.max(maxArea, height[LastIndex] * (LastIndex - firstIndex));
        LastIndex--;
      }
    }
    return maxArea;
  }

  /**
   * Best Solution.
   */
  // Runtime : 1ms, Memory : 57MB.
  public int maxAreaV3(int[] height) {

    int s = 0, e = height.length - 1;
    int max = 0;
    while (s < e) {
      if (height[s] > height[e]) {
        int area = height[e] * (e - s);
        if (max < area) {
          max = area;
        }
        int c = height[e];
        while (e >= 0 && height[e] <= c) {
          e--;
        }
      } else {
        int area = height[s] * (e - s);
        if (max < area) {
          max = area;
        }
        int c = height[s];
        while (s < height.length && height[s] <= c) {
          s++;
        }
      }
    }
    return max;
  }


}
