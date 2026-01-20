package solutions;

public class TrappingRainWater {


        /*
        Given n non-negative integers representing an elevation map where the width of each bar is 1,
        compute how much water it can trap after raining.

        Notice that the solution set must not contain duplicate triplets.


        Height
         3 |              █
         2 |        █~~~~~█~█
         1 |    █~~~█~█~~~█~█~█
         0 | █~~█~█~~█~█~~█~█~~█
             -------------------
               0 1 2 3 4 5 6 7 8 9 10 11



        Example 1:
        ------------------------------
        ------------------------------
        Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
        Output: 6
        Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
        In this case, 6 units of rain water (blue section) are being trapped.
        ------------------------------

        Example 2:
        ------------------------------
        ------------------------------
        Input: nums = [0,1,1]
        Output: []
        Explanation: The only possible triplet does not sum up to 0.
        ------------------------------

        Example 3:
        ------------------------------
        ------------------------------
        Input: nums = [0,0,0]
        Output: [[0,0,0]]
        Explanation: The only possible triplet sums up to 0.
        ------------------------------

        Constraints:
        ------------------------------
        ------------------------------
        3 <= nums.length <= 3000
        -105 <= nums[i] <= 105
        ------------------------------

      */

    /**
     * best solution.
     */
    // Runtime : 0ms, Memory : 48MB.
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {

            if (height[left] <= height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                water += leftMax - height[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];
                right--;
            }
        }
        return water;
    }

}
