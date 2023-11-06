import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import linkedlist.PracticeLinkedList;
import solutions.CanPlaceFlowers;
import solutions.ContainsDuplicateLeetCode;
import solutions.GreatestCommonDivisorOfStrings;
import solutions.KidsWithTheGreatestNumberOfCandies;
import solutions.LongestCommonPrefix;
import solutions.MergeAlternately;
import solutions.ReverseVowelsOfAString;
import solutions.RomanToIntegerLeetCode;
import solutions.ValidParentheses;

public class Main {



  public static void main(String[] args) throws ParseException {

    ContainsDuplicateLeetCode codeProblems = new ContainsDuplicateLeetCode();
    RomanToIntegerLeetCode romanToIntegerLeetCode = new RomanToIntegerLeetCode();
    MergeAlternately mergeAlternately = new MergeAlternately();
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
    ValidParentheses validParentheses = new ValidParentheses();
    GreatestCommonDivisorOfStrings divisorOfStrings = new GreatestCommonDivisorOfStrings();
    KidsWithTheGreatestNumberOfCandies kids = new KidsWithTheGreatestNumberOfCandies();
    CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
    ReverseVowelsOfAString reverseVowelsOfAString = new ReverseVowelsOfAString();

    System.out.println();



    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/

    /* Leet Code longestCommonPrefix */
    String[] strs = new String[]{"Flight", "Flow", "Flower"};
    //longestCommonPrefix.longestCommonPrefix(strs);
    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/




    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/

    /* Leet Code validParentheses */
    String strs2 = "]";
    //validParentheses.isValid(strs2);
    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/




    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/

    /* Leet Code 217: Contains Duplicate set Problem TestCase */
    int[] nums1 = new int[]{1, 2, 3, 4, 5, 8};
    int[] nums2 = new int[]{1,2,3,1};
    int[] nums3 = new int[]{1,1,1,3,3,4,3,2,4,2};
    int[] nums4 = new int[]{1,2,3,4};
    // LeetCode 217: Contains Duplicate
    //System.out.println();
    //System.out.println("Leet Code 217: Contains Duplicate:  "+codeProblems.containsDuplicate(nums3));
    //System.out.println("Leet Code 217: Contains Duplicate:  "+codeProblems.containsDuplicateBeginnerApproach(nums4));
    //System.out.println("Leet Code 217: Contains Duplicate:  "+codeProblems.containsDuplicateSetApproach(nums3));
    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/


    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/

    /* Leet Code 13: Roman to Integer set Problem TestCase */
    String s1 = "III";
    String s2 = "LVIII";
    String s3 = "MCMXCIV";
    // LeetCode 13: Roman to Integer set Problem TestCase
    //System.out.println();
    //System.out.println("Leet Code 13: Roman to Integer:  "+romanToIntegerLeetCode.romanToInt(s3));
    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/


    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/

    /* Leet Code 1768. Merge Strings Alternately set Problem TestCase */
    String mergeString1 = "abc";
    String mergeString2 = "pqr";
    String mergeString3 = "ab";
    String mergeString4 = "pqrs";
    String mergeString5 = "abcd";
    String mergeString6 = "pq";
    // LeetCode 1768: Merge Strings Alternately
    System.out.println();
    //System.out.println("Leet Code 1768: Merge Strings Alternately:  "
    //       + mergeAlternately.mergeAlternately(mergeString3,mergeString4));
    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/


    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/

    /* Leet Code 1071: Greatest Common Divisor of Strings set Problem TestCase */
    String gcdOfStrings1 = "ABCABCABC";
    String gcdOfStrings2 = "ABC";
    String gcdOfStrings3 = "ABABAB";
    String gcdOfStrings4 = "ABAB";
    String gcdOfStrings5 = "LEET";
    String gcdOfStrings6 = "CODE";
    String gcdOfStrings7 = "ABCABC";
    String gcdOfStrings8 = "ABCABC";
    // LeetCode 1071:Greatest Common Divisor of Strings
    System.out.println();
    //System.out.println("Leet Code 1071: Greatest Common Divisor of Strings:  "
    //        + divisorOfStrings.gcdOfStrings(gcdOfStrings3, gcdOfStrings4));

    //System.out.println("Leet Code 1071: Greatest Common Divisor of Strings:  "
    //        + divisorOfStrings.gcdOfStringsV2(gcdOfStrings1, gcdOfStrings2));
    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/



    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/

    /* Merged Two UnsortedList with [list/arraylist] */
    ArrayList<Integer> numberList1 = new ArrayList<Integer>(){{add(55);add(92);add(401);}};
    ArrayList<Integer> numberList2 = new ArrayList<Integer>(){{add(113);add(31);add(27);}};
    //System.out.println(mergedTwoUnsortedList(numberList1,numberList2));
    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/




     /*----------------------------------------------------------------
    ------------------------------------------------------------------*/

    /* Leet Code 1431. Kids With the Greatest Number of Candies of Strings set Problem TestCase */
    int [] candies1 = {2,3,5,1,3};
    int extraCandies1 = 3;
    int [] candies2 = {12,1,12};
    int extraCandies2 = 10;
    int [] candies3 = {4,2,1,1,2};
    int extraCandies3 = 1;

    // LeetCode 1431. Kids With the Greatest Number of Candies
    System.out.println();
    //System.out.println("LeetCode 1431. Kids With the Greatest Number of Candies:  "
    //        + kids.kidsWithCandies(candies1, extraCandies1));

    //System.out.println("LeetCode 1431. Kids With the Greatest Number of Candies:  "
    //        + kids.kidsWithCandiesV2(candies3, extraCandies3));
    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/



    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/

    /* Pattern Problems Practice */
    //solutions.PatternProblem patternProblem = new solutions.PatternProblem();
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
    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/



    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/

    /* Leet Code 605. Can Place Flowers set Problem TestCase */
    int [] flowerSet1 = {0,0,1,0,0};
    int newFlowers1 = 2;
    int [] flowerSet2 = {1,0,0,0,1};
    int newFlowers2 = 1;
    int [] flowerSet3= {1,0,0,0,1};
    int newFlowers3 = 2;
    int [] flowerSet4 = {0,0,1,0,0};
    int newFlowers4 = 3;
    int [] flowerSet5 = {1};
    int newFlowers5 = 1;

    // LeetCode 605. Kids With the Greatest Number of Candies
    System.out.println();
    //System.out.println("LeetCode 605. Can Place Flowers:  "
    //        + kids.kidsWithCandies(candies1, extraCandies1));

    //System.out.println("LeetCode 605. Can Place Flowers set Problem TestCase:  "+
    //    Arrays.toString(flowerSet5) +", "+ newFlowers5 + ", result "
    //    + canPlaceFlowers.canPlaceFlowers(flowerSet5, newFlowers5));
    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/


    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/

    /* Leet Code 345.Reverse Vowels of a String set Problem TestCase */

    String reverseVowels1 = "hello";
    String reverseVowels2 = "leetcode";
    String reverseVowels3 = "aA";


    // Leet Code 345.Reverse Vowels of a String
    System.out.println();
    System.out.println("Leet Code 345.Reverse Vowels of a String set Problem TestCase:  " +reverseVowels3+ " -> Result: "
        + reverseVowelsOfAString.reverseVowels(reverseVowels3));

    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/

    System.out.println();

  }



  public void LinkedListProblemCallBack(){

    /* Practicing LinkedList Basic operation */
    PracticeLinkedList pLinkedList = new PracticeLinkedList();
    pLinkedList.addFirst("a");
    pLinkedList.addFirst("is");

    /* printing LinkedList */
    // pLinkedList.printList();

    /* addLast */
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



}