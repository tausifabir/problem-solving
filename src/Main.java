import java.text.ParseException;
import java.util.*;

public class Main {



  public static void main(String[] args) throws ParseException {

    int[] nums = new int[]{1, 2, 3, 4, 5, 8, 3};
    String[] strs = new String[]{"Flight", "Flow", "Flower"};
    String strs2 = "]";

    ArrayList<Integer> numberList1 = new ArrayList<Integer>(){{add(55);add(92);add(401);}};
    ArrayList<Integer> numberList2 = new ArrayList<Integer>(){{add(113);add(31);add(27);}};


    //boolean result = containsDuplicate(nums);
    //String str = longestCommonPrefix(strs);

    // containsDuplicate
    //System.out.println(result);


    // longestCommonPrefix
    //System.out.println(str);

    // Merged Two UnsortedList with [list/arraylist]
    //System.out.println(mergedTwoUnsortedList(numberList1,numberList2));

    // Pattern Problems Practice
    PatternProblem patternProblem = new PatternProblem();
    //patternProblem.solidRectanglePatternProblem(4);
    //patternProblem.hollowPatternProblem(5);
    //patternProblem.halfPyramidPatternProblem(5);
    //patternProblem.halfPyramidReversePatternProblem(4);
    //patternProblem.halfPyramidInvertedPatternProblem(4);
    //patternProblem.halfPyramidPatternWithNumbersProblem(5);
    //patternProblem.halfPyramidInvertedPatternWithNumbersProblem(5);
    //patternProblem.floydTriangleProblem(5);
    //patternProblem.zeroOneTriangleProblem(5);
    patternProblem.solidRhombusProblem(5);

    // Practicing LinkedList Basic operation
      PracticeLinkedList pLinkedList = new PracticeLinkedList();
      pLinkedList.addFirst("a");
      pLinkedList.addFirst("is");

      // printing LinkedList
      pLinkedList.printList();

      // addLast
      pLinkedList.addLast("LinkedList");
      pLinkedList.addLast("List");
      pLinkedList.addFirst("This");
      pLinkedList.printList();


      pLinkedList.deleteLast();
      pLinkedList.printList();
      pLinkedList.getLinkedListSize();
      pLinkedList.deleteFirst();
      pLinkedList.printList();
      pLinkedList.deleteLast();
      pLinkedList.deleteLast();
      pLinkedList.printList();
      pLinkedList.deleteFirst();
      pLinkedList.printList();
      pLinkedList.addFirst("This");
      pLinkedList.printList();
      pLinkedList.getLinkedListSize();
  }


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
  public static boolean containsDuplicate(int[] nums) {
    HashMap<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      if (numberMap.containsValue(nums[i])) {
        return true;
      }
      numberMap.put(nums[i], nums[i]);
    }
    return false;
  }


  /*
   * Write a function to find the longest common prefix string amongst an array of strings.
   * If there is no common prefix, return an empty string "".
   * -------------------------------------------------------
   * Example 1:
   * Input: strs = ["flower","flow","flight"]
   * Output: "fl"
   * --------------------------------------------------------
   * Example 2:
   * Input: strs = ["dog","racecar","car"]
   * Output: ""
   * Explanation: There is no common prefix amongst the input strings.
   * ---------------------------------------------------------
   * */
  public static String longestCommonPrefix(String[] strs) {

    if (strs.length < 0) return "";
    String firstElement = strs[0];

    for (int j = 1; j < strs.length; j++) {
      while (strs[j].indexOf(firstElement) != 0) {
        firstElement = firstElement.substring(0, firstElement.length() - 1);
      }
    }
    return firstElement;
  }


  public static boolean isValid(String s) {
    String[] strs = {"(", ")", "[", "]", " {", "}"};
    String strs2 = "()[]{}";

    for (int i = 0; i < strs2.length(); i++) {
      if (s.length() == 1) {
        if (s.charAt(i) == strs2.charAt(i)) {
          System.out.println("s is matched " + s.charAt(i) + "=" + strs2.charAt(i));
          return true;
        } else if (s.charAt(i) == strs2.charAt(i + 2)) {
          System.out.println("s is matched " + s.charAt(i) + "=" + strs2.charAt(i + 2));
          return true;
        } else if (s.charAt(i) == strs2.charAt(i + 4)) {
          System.out.println("s is matched " + s.charAt(i) + "=" + strs2.charAt(i + 4));
          return true;
        } else {
          return false;
        }
      }
    }
    return false;
  }

  /*
  * You are given the heads of two sorted linked lists list1 and list2.
  * Merge the two lists in a one sorted list.
  * The list should be made by splicing together the nodes of the first two lists.
  * Return the head of the merged linked list.
  *
  * Input: list1 = [1,2,4], list2 = [1,3,4]
  * Output: [1,1,2,3,4,4]
  *
  * Example 2:
  * Input: list1 = [], list2 = []
  * Output: []
  *
  * Example 3:
  * Input: list1 = [], list2 = [0]
  * Output: [0]
  * */

  public static List<Integer> mergedTwoUnsortedList(List<Integer> numberList1,List<Integer> numberList2) {

    numberList1.addAll(numberList2);

    // Selection Sort Technique
    for(int i=0;i<numberList1.size();i++){
      for(int j = i+1; j<numberList1.size();j++){
        if(numberList1.get(i)>numberList1.get(j)){
          int temp = numberList1.get(i);
          numberList1.set(i, numberList1.get(j));
          numberList1.set(j, temp);
        }
      }
    }
    return numberList1;

  }

}