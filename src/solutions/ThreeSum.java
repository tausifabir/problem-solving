package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    /*
        Given an integer array nums, return all the triplets
        [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
        and nums[i] + nums[j] + nums[k] == 0.

        Notice that the solution set must not contain duplicate triplets.

        Example 1:
        ------------------------------
        ------------------------------
        Input: nums = [-1,0,1,2,-1,-4]
        Output: [[-1,-1,2],[-1,0,1]]
        Explanation:
        nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
        nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
        nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
        The distinct triplets are [-1,0,1] and [-1,-1,2].
        Notice that the order of the output and the order of the triplets does not matter.
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
     * primary thoughtful process 1st approach.
     */
    // Runtime : 34s, Memory : 60MB.
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Fix the first number
        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first numbers
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int leftPointer = i + 1;
            int rightPointer = nums.length - 1;

            System.out.println("I pointer: " + nums[i]);
            System.out.println("Left pointer: " + nums[leftPointer]);
            System.out.println("Right pointer: " + nums[rightPointer]);

            // Step 3: Two-pointer search
            while (leftPointer < rightPointer) {

                int currentSum = nums[i] + nums[leftPointer] + nums[rightPointer];


                System.out.println("Inside I pointer: " + nums[i]);
                System.out.println("Inside Left pointer: " + nums[leftPointer]);
                System.out.println("Inside Right pointer: " + nums[rightPointer]);

                if (currentSum == 0) {

                    // Found a valid triplet
                    result.add(
                            Arrays.asList(
                                    nums[i],
                                    nums[leftPointer],
                                    nums[rightPointer]
                            )
                    );

                    // Skip duplicate second number
                    while (leftPointer < rightPointer &&
                            nums[leftPointer] == nums[leftPointer + 1]) {
                        leftPointer++;
                    }

                    // Skip duplicate third number
                    while (leftPointer < rightPointer &&
                            nums[rightPointer] == nums[rightPointer - 1]) {
                        rightPointer--;
                    }

                    // Move both pointers after storing result
                    leftPointer++;
                    rightPointer--;

                } else if (currentSum < 0) {
                    // Need a larger sum → move left pointer right
                    leftPointer++;
                } else {
                    // Need a smaller sum → move right pointer left
                    rightPointer--;
                }
            }
        }

        return result;
    }



    /**
     * best solution.
     */
    // Runtime : 28s, Memory : 60MB.
    public List<List<Integer>> threeSumV2(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        if (nums.length < 3) return result;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Early exit if nums[i] is positive
            if (nums[i] > 0) break;

            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Add triplet to result
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Move left pointer past duplicates
                    int leftValue = nums[left];
                    while (left < right && nums[left] == leftValue) left++;

                    // Move right pointer past duplicates
                    int rightValue = nums[right];
                    while (left < right && nums[right] == rightValue) right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}
