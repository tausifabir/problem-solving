import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {



  public static void main(String[] args) throws ParseException {

    ContainsDuplicateLeetCode codeProblems = new ContainsDuplicateLeetCode();
    RomanToIntegerLeetCode romanToIntegerLeetCode = new RomanToIntegerLeetCode();
    MergeAlternately mergeAlternately = new MergeAlternately();

    String[] strs = new String[]{"Flight", "Flow", "Flower"};
    String strs2 = "]";

    ArrayList<Integer> numberList1 = new ArrayList<Integer>(){{add(55);add(92);add(401);}};
    ArrayList<Integer> numberList2 = new ArrayList<Integer>(){{add(113);add(31);add(27);}};


    System.out.println();

    // Leet Code 217: Contains Duplicate set Problem TestCase
    int[] nums1 = new int[]{1, 2, 3, 4, 5, 8};
    int[] nums2 = new int[]{1,2,3,1};
    int[] nums3 = new int[]{1,1,1,3,3,4,3,2,4,2};
    int[] nums4 = new int[]{1,2,3,4};
    // LeetCode 217: Contains Duplicate
    //System.out.println("Leet Code 217: Contains Duplicate:  "+codeProblems.containsDuplicate(nums3));
    //System.out.println("Leet Code 217: Contains Duplicate:  "+codeProblems.containsDuplicateBeginnerApproach(nums4));
    //System.out.println("Leet Code 217: Contains Duplicate:  "+codeProblems.containsDuplicateSetApproach(nums3));


    // Leet Code 13: Roman to Integer set Problem TestCase
    String s1 = "III";
    String s2 = "LVIII";
    String s3 = "MCMXCIV";
    // LeetCode 13: Roman to Integer set Problem TestCase
    //System.out.println("Leet Code 13: Roman to Integer:  "+romanToIntegerLeetCode.romanToInt(s3));

    // Leet Code 1768. Merge Strings Alternately
    String mergeString1 = "abc";
    String mergeString2 = "pqr";
    String mergeString3 = "ab";
    String mergeString4 = "pqrs";
    String mergeString5 = "abcd";
    String mergeString6 = "pq";
    // LeetCode 1768: Merge Strings Alternately
    System.out.println("Leet Code 1768: Merge Strings Alternately:  " + mergeAlternately.mergeAlternately(mergeString3,mergeString4));

    //String str = longestCommonPrefix(strs);




    // longestCommonPrefix
    //System.out.println(str);

    // Merged Two UnsortedList with [list/arraylist]
    //System.out.println(mergedTwoUnsortedList(numberList1,numberList2));

    // Pattern Problems Practice
    //PatternProblem patternProblem = new PatternProblem();
    //patternProblem.solidRectanglePatternProblem(4);
    //patternProblem.hollowPatternProblem(5);
    //patternProblem.halfPyramidPatternProblem(5);
    //patternProblem.halfPyramidReversePatternProblem(4);
    //patternProblem.halfPyramidInvertedPatternProblem(4);
    //patternProblem.halfPyramidPatternWithNumbersProblem(5);
    //patternProblem.halfPyramidInvertedPatternWithNumbersProblem(5);
    //patternProblem.floydTriangleProblem(5);
    //patternProblem.zeroOneTriangleProblem(5);
    //patternProblem.solidRhombusProblem(5);

    // Practicing LinkedList Basic operation
      PracticeLinkedList pLinkedList = new PracticeLinkedList();
      pLinkedList.addFirst("a");
      pLinkedList.addFirst("is");

      // printing LinkedList
     // pLinkedList.printList();

      // addLast
      pLinkedList.addLast("LinkedList");
      pLinkedList.addLast("List");
      pLinkedList.addFirst("This");
      //pLinkedList.printList();


//      pLinkedList.deleteLast();
//      pLinkedList.printList();
//      pLinkedList.getLinkedListSize();
//      pLinkedList.deleteFirst();
//      pLinkedList.printList();
//      pLinkedList.deleteLast();
//      pLinkedList.deleteLast();
//      pLinkedList.printList();
//      pLinkedList.deleteFirst();
//      pLinkedList.printList();
//      pLinkedList.addFirst("This");
//      pLinkedList.printList();
//      pLinkedList.getLinkedListSize();
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