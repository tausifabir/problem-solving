import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicateLeetCode {

    /*
      Given an integer array nums, return true
      if any value appears at least twice in the array,
      and return false if every element is distinct.
      ------------------------------
      * Input: nums = [1,2,3,1]
      * Output: true
      --------------------------
      * Input: nums = [1,2,3,4]
      * Output: false
      ----------------------------
      * Input: nums = [1,1,1,3,3,4,3,2,4,2]
      * Output: true
    */
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (numberMap.containsValue(nums[i])) {
                return true;
            }
            numberMap.put(nums[i], nums[i]);
        }
        return false;
    }

    public boolean containsDuplicateBeginnerApproach(int[] nums) {

        for (int i = 0; i <= nums.length; i++) {
            for(int j = i+1; j <= nums.length-1; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsDuplicateSetApproach(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!set.add(nums[i])){
                return true;
            }
        }

        return false;
    }

}
