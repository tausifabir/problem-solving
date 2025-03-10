import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import linkedlist.PracticeLinkedList;
import solutions.CanPlaceFlowers;
import solutions.ConcatenationArray;
import solutions.ContainerWithMostWater;
import solutions.ContainsDuplicateLeetCode;
import solutions.GreatestCommonDivisorOfStrings;
import solutions.GroupAnagrams;
import solutions.IncreasingTripletSubsequenceLeetCode;
import solutions.IsSubsequence;
import solutions.KidsWithTheGreatestNumberOfCandies;
import solutions.LongestCommonPrefix;
import solutions.MergeAlternately;
import solutions.MergedTwoUnsortedList;
import solutions.MoveZeroes;
import solutions.ProductOfArrayExceptSelf;
import solutions.ReplaceElementsArray;
import solutions.ReverseVowelsOfAString;
import solutions.ReverseWordsInAString;
import solutions.RomanToIntegerLeetCode;
import solutions.SortVowelsInAString;
import solutions.StringCompression;
import solutions.TopKFrequent;
import solutions.TwoSum;
import solutions.TwoSumIIInput;
import solutions.ValidAnagram;
import solutions.ValidPalindrome;
import solutions.ValidParentheses;



public class Main {



  /** Main Method.*/
  public static void main(String[] args) throws ParseException {

    ContainsDuplicateLeetCode codeProblems = new ContainsDuplicateLeetCode();
    MergedTwoUnsortedList mergedTwoUnsortedList = new MergedTwoUnsortedList();
    RomanToIntegerLeetCode romanToIntegerLeetCode = new RomanToIntegerLeetCode();
    MergeAlternately mergeAlternately = new MergeAlternately();
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
    ValidParentheses validParentheses = new ValidParentheses();
    GreatestCommonDivisorOfStrings divisorOfStrings = new GreatestCommonDivisorOfStrings();
    KidsWithTheGreatestNumberOfCandies kids = new KidsWithTheGreatestNumberOfCandies();
    CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
    ReverseVowelsOfAString reverseVowelsOfString = new ReverseVowelsOfAString();
    ReverseWordsInAString reverseWordsInString = new ReverseWordsInAString();
    ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
    SortVowelsInAString sortVowelsInString = new SortVowelsInAString();
    IncreasingTripletSubsequenceLeetCode increasingTriplet = new IncreasingTripletSubsequenceLeetCode();
    StringCompression stringCompression = new StringCompression();
    ConcatenationArray concatenationArray = new ConcatenationArray();
    ValidAnagram validAnagram = new ValidAnagram();
    ReplaceElementsArray replaceElementsArray = new ReplaceElementsArray();
    MoveZeroes moveZeroes = new MoveZeroes();
    IsSubsequence isSubsequence = new IsSubsequence();
    ContainerWithMostWater container = new ContainerWithMostWater();
    ValidPalindrome validPalindrome = new ValidPalindrome();
    TwoSum callTwoSum = new TwoSum();
    TopKFrequent topKFrequent = new TopKFrequent();
    TwoSumIIInput sumIIInput = new TwoSumIIInput();
    GroupAnagrams groupAnagrams = new GroupAnagrams();

    System.out.println();




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

    /* Leet Code Problem set */

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
    int[] nums2 = new int[]{1, 2, 3, 1};
    int[] nums3 = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
    int[] nums4 = new int[]{1, 2, 3, 4};
    // LeetCode 217: Contains Duplicate
    System.out.println();
    System.out.println("Leet Code 217: Contains Duplicate:  " + codeProblems.containsDuplicate(nums3));
    System.out.println("Leet Code 217: Contains Duplicate:  " + codeProblems.containsDuplicateBeginnerApproach(nums4));
    System.out.println("Leet Code 217: Contains Duplicate:  " + codeProblems.containsDuplicateSetApproach(nums3));
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

    /* Leet Code 21. Merge Two Sorted Lists */
    ArrayList<Integer> numberList1 = new ArrayList<Integer>() {
      {
        add(55);
        add(92);
        add(401);
      }
    };
    ArrayList<Integer> numberList2 = new ArrayList<Integer>() {
      {
        add(113);
        add(31);
        add(27);
      }
    };

    System.out.println("LeetCode 21. Merge Two Sorted Lists set Problem TestCase =>  \n"
            + "given 1st list: " + numberList1
            + "\ngiven 2nd list: " + numberList2
            + "\n-> Result:      "
            + mergedTwoUnsortedList.mergedTwoUnsortedList(numberList1, numberList2));
    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/




    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/

    /* Leet Code 1431. Kids With the Greatest Number of Candies of Strings set Problem TestCase */
    int[] candies1 = {2, 3, 5, 1, 3};
    int extraCandies1 = 3;
    int[] candies2 = {12, 1, 12};
    int extraCandies2 = 10;
    int[] candies3 = {4, 2, 1, 1, 2};
    int extraCandies3 = 1;

    // LeetCode 1431. Kids With the Greatest Number of Candies
    System.out.println();
    System.out.println("LeetCode 1431. Kids With the Greatest Number of Candies  set Problem TestCase =>   "
            + "\ngiven candies array: " + Arrays.toString(candies1) + " givenExtra candies: " + extraCandies1
            + "\n-> Result: "
            + kids.kidsWithCandies(candies1, extraCandies1));

    System.out.println();
    System.out.println("LeetCode 1431. Kids With the Greatest Number of Candies  set Problem TestCase =>   "
            + "\ngiven candies array: " + Arrays.toString(candies3) + " givenExtra candies: " + extraCandies3
            + "\n-> Result: "
            + kids.kidsWithCandiesV2(candies3, extraCandies3));
    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/



    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/

    /* Leet Code 605. Can Place Flowers set Problem TestCase */
    int[] flowerSet1 = {0, 0, 1, 0, 0};
    int newFlowers1 = 2;
    int[] flowerSet2 = {1, 0, 0, 0, 1};
    int newFlowers2 = 1;
    int[] flowerSet3 = {1, 0, 0, 0, 1};
    int newFlowers3 = 2;
    int[] flowerSet4 = {0, 0, 1, 0, 0};
    int newFlowers4 = 3;
    int[] flowerSet5 = {1};
    int newFlowers5 = 1;

    // LeetCode 605. Can Place Flowers
    System.out.println();

    System.out.println("LeetCode 605. Can Place Flowers set Problem TestCase =>  "
            + "\ngiven array: " + Arrays.toString(flowerSet4) + ", want to plants: "
            + newFlowers4
            + "\n  -> Result: " + canPlaceFlowers.canPlaceFlowers(flowerSet4, newFlowers4));
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
    System.out.println("Leet Code 345.Reverse Vowels of a String set Problem TestCase =>  given array: "
            + reverseVowels3
            + " -> Result: " + reverseVowelsOfString.reverseVowels(reverseVowels3));

    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/


    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/

    /* Leet Code 151. Reverse Words in a String set Problem TestCase */

    String reverseWords1 = " the sky is blue ";
    String reverseWords2 = "  hello world  ";
    String reverseWords3 = "a good   example";

    // Leet Code 151. Reverse Words in a String
    System.out.println();
    System.out.println("Leet Code 151. Reverse Words in a String set Problem TestCase =>   given array: "
            + reverseWords3
            + " -> Result: "
            + reverseWordsInString.reverseWords(reverseWords3));

    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/


    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/
    /* Leet Code 238. Product of Array Except Self set Problem TestCase */

    int[] productArray1 = {1, 2, 3, 4};
    int[] productArray2 = {-1, 1, 0, -3, 3};


    // Leet Code 238. Product of Array Except Self
    System.out.println();
    System.out
        .println("Leet Code 238. Product of Array Except Self set Problem TestCase =>  given array: "
            + Arrays.toString(productArray1) + " -> Result: "
            + Arrays.toString(productOfArrayExceptSelf.productExceptSelfV2(productArray1)));

    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/


    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/
    /* Leet Code 2785. Sort Vowels in a String set Problem TestCase */

    String sortVowels1 = "lEetcOde";
    String sortVowels2 = "lYmpH";


    // Leet Code 2785. Sort Vowels in a String
    System.out.println();
    System.out
        .println("Leet Code 2785. Sort Vowels in a String set Problem TestCase => given array: "
            + sortVowels1
            + " -> Result: "
            + sortVowelsInString.sortVowels(sortVowels1));

    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/



    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/
    /* Leet Code 334. Increasing Triplet Subsequence set Problem TestCase */

    int[] increasingTriplet1 = {1, 4, 3, 40, 200};
    int[] increasingTriplet2 = {5, 4, 3, 2, 1};
    int[] increasingTriplet3 = {2, 1, 5, 0, 4, 6};
    int[] increasingTriplet4 = {20, 100, 10, 12, 5, 1};


    // Leet Code 334. Increasing Triplet Subsequence
    System.out.println();
    System.out
        .println("Leet Code 334. Increasing Triplet Subsequence set Problem TestCase => given array: "
            + Arrays.toString(increasingTriplet4)
            + " -> Result: "
            + increasingTriplet.increasingTripletBeginnerApproachV3(increasingTriplet4));

    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/



    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/
    /* Leet Code 443. String Compression set Problem TestCase */

    char [] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
    char [] chars1 = {'a'};
    char [] chars2 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
    char [] chars3 = {'a', 'a', 'a', 'd', 'd', 'e', 'f'};
    int [] nums = {1,2,1};


    // Leet Code 443. String Compression
    System.out.println();
    System.out
        .println("Leet Code 443. String Compression set Problem TestCase => given array: "
            + Arrays.toString(chars2)
            + " -> Result: "
            + stringCompression.compressProperSolution(chars2));

    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/


    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/
    /* Leet Code 1929. Concatenation of Array set Problem TestCase */

    int[] Concatenation1 = {1, 2, 1};
    int[] Concatenation2 = {1, 3, 2, 1};
    int[] Concatenation3 = {4, 2, 1, 5};
    int[] Concatenation4 = {1};
    int[] Concatenation5 = {1, 2, 1, 4};


    // Leet Code 1929. Concatenation of Array
    System.out.println();
    System.out
        .println("Leet Code 1929. Concatenation of Array set Problem TestCase => given array: "
            + Arrays.toString(Concatenation1)
            + " -> Result: "
            + Arrays.toString(concatenationArray.bestSolutionsV2(Concatenation1)));

    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/



    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/
    /* Leet Code 242. Valid Anagram set Problem TestCase */

    String anagramS1 = "anagram";
    String anagramT1 = "nagaram";
    String anagramS2 = "rat";
    String anagramT2 = "car";
    String anagramS3 = "aacc";
    String anagramT3 = "ccac";



    // Leet Code 242. Valid Anagram
    System.out.println();
    System.out
        .println("Leet Code 242. Valid Anagram set Problem TestCase => "
            + "\nGiven 1st String S => " + anagramS3 + " And  2nd String T => " + anagramT3
            + " -> Result: "
            + validAnagram.isAnagram(anagramS3, anagramT3));

    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/


        /*----------------------------------------------------------------
    ------------------------------------------------------------------*/
    /* Leet Code 1299. Replace Elements with Greatest Element on Right Side set Problem TestCase */

    int [] arrElements1 = {17, 18, 5, 4, 6, 1};
    int [] arrElements2 = {17, 1};

    // Leet Code 1299. Replace Elements with Greatest Element
    System.out.println();
    System.out
        .println("Leet Code 1299. Replace Elements with Greatest Element on Right Side set Problem "
            + "TestCase => Given arr : " + Arrays.toString(arrElements2)
            + " -> Result: " + Arrays.toString(replaceElementsArray.replaceElementsV1(arrElements2)));

    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/


    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/
    /* Leet Code 283. Move zeros set Problem TestCase */

    int [] numsZeros1 = {0, 1, 0, 3, 12};
    int [] numsZeros2 = {0};
    int [] numsZeros3 = {2,1};
    int [] numsZeros4 = {0,1,0};
    int [] numsZeros5 = {4,2,4,0,0,3,0,5,1,0};
    int [] numsZeros6 = {0,1,5,0,12,9,0};

    // Leet Code 283. Move zeros
    System.out.println();
    System.out
        .println("Leet Code 283. Move zeros set Problem TestCase => "
            + "\nGiven array => " + Arrays.toString(numsZeros1)
            + " -> Result: "
            + Arrays.toString(moveZeroes.movingZeroesV3(numsZeros1)));

    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/



    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/
    /* Leet Code 392. Is Subsequence set Problem TestCase */

    String isSubsequenceS = "ace";
    String isSubsequenceT = "abcde";
    String isSubsequenceS1 = "ace";
    String isSubsequenceT1 = "cbade";
    String isSubsequenceS2 = "abc";
    String isSubsequenceT2 = "ahbgdc";
    String isSubsequenceS3 = "axc";
    String isSubsequenceT3 = "ahbgdc";
    String isSubsequenceS4 = "ab";
    String isSubsequenceT4 = "baab";
    String isSubsequenceS5 = "";
    String isSubsequenceT5 = "ahbgdc";
    String isSubsequenceS6 = "abc";
    String isSubsequenceT6 = "";
    String isSubsequenceS7 = "b";
    String isSubsequenceT7 = "abc";

    //  Leet Code 392. Is Subsequence
    System.out.println();
    System.out
        .println("Leet Code392. Is Subsequence set Problem TestCase => "
            + "\ngiven String s: " + isSubsequenceS7 + " and given String T: " + isSubsequenceT7
            + " -> Result: "
            + isSubsequence.isSubsequenceV3(isSubsequenceS7, isSubsequenceT7));

    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/


    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/
    /* Leet Code 125. Valid Palindrome set Problem TestCase */

    String isvalidPalindrome1 = "A man, a plan, a canal: Panama";
    String isvalidPalindrome2 = "race a car";
    String isvalidPalindrome3 = " ";
    String isvalidPalindrome4 = "Level";
    String isvalidPalindrome5 = "1b1";


    // Leet Code 125. Valid Palindrome
    System.out.println();
    System.out
        .println("Leet Code 125. Valid Palindrome set Problem TestCase => "
            + "\nGiven String => " + isvalidPalindrome4
            + " -> Result: "
            + validPalindrome.isPalindromeV2(isvalidPalindrome4));

    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/


    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/
    /* Leet Code 1. Two Sum set Problem TestCase */

    int [] twoSum1 = {2,7,11,15};
    int target1 = 9;
    int [] twoSum2 = {3,2,4};
    int target2 = 6;
    int [] twoSum3 = {3,3};
    int target3 = 6;


    // Leet Code 1. Two Sum
    System.out.println();
    System.out.println("Leet Code 1. Two Sum set Problem TestCase =>  "
        + "\ngiven array: " + Arrays.toString(twoSum2) + ", target: " + target2
        + "\n  -> Result: " + Arrays.toString(callTwoSum.twoSumV2(twoSum2, target2)));

    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/


    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/
    /* Leet Code 11. Container With Most Water set Problem TestCase */

    int [] height1 = {0, 1, 0, 3, 12};
    int [] height2 = {0};
    int [] height3 = {1,8,6,2,5,4,8,3,7};
    int [] height4 = {0,1,0};
    int [] height5 = {1, 1};


    // Leet Code 11. Container With Most Water
    System.out.println();
    System.out
        .println("Leet Code 11. Container With Most Water set Problem TestCase => "
            + "\nGiven array => " + Arrays.toString(height3)
            + " -> Result: "
            + container.maxAreaV3(height3));

    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/


    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/
    /* Leet Code 167. Two Sum II - Input Array Is Sorted set Problem TestCase */

    int [] twoSumII1 = {2,7,11,15};
    int targetII1 = 9;
    int [] twoSumII2 = {3,2,4};
    int targetII2 = 6;
    int [] twoSumII3 = {3,3};
    int targetII3 = 6;


    // Leet Code 167. Two Sum II - Input Array Is Sorted
    System.out.println();
    System.out.println("Leet Code 167. Two Sum II - Input Array Is Sorted Problem TestCase =>  "
        + "\ngiven array: " + Arrays.toString(twoSumII1) + ", target: " + targetII1
        + "\n  -> Result: " + Arrays.toString(sumIIInput.twoSumII(twoSumII1, targetII1)));

    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/




    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/
    /* Leet Code 347. Top K Frequent Elements Problem TestCase */

    int [] topKNums1 = {1,1,1,2,2,3};
    int topK1 = 2;
    int [] topKNums2 = {1,2,2,3,3,3};
    int topK2 = 2;
    int [] topKNums3 = {7,7};
    int topK3 = 1;
    int [] topKNums4 = {1,2,3,1,2,5,4,2};
    int topK4 = 1;


    // Leet Code 347. Top K Frequent Elements
    System.out.println();
    System.out.println("Leet Code 347. Top K Frequent Elements TestCase =>  "
        + "\ngiven array: " + Arrays.toString(topKNums1) + ", target: " + topK1
        + "\n  -> Result: " + Arrays.toString(topKFrequent.topKFrequent(topKNums1, topK1)));

    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/



    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/
    /* Leet Code 47. Group Anagrams Problem TestCase */

    String [] grpStrs = {"eat","tea","ate","tan","nat","bat"};
    String [] grpStrs1 = {""};


    // Leet Code 47. Group Anagrams
    System.out.println();
    System.out.println("Leet Code 47. Group Anagrams TestCase =>  "
        + "\nGiven array => " + Arrays.toString(grpStrs1)
        + " -> Result: "
        + groupAnagrams.groupAnagrams(grpStrs1));

    /*----------------------------------------------------------------
    ------------------------------------------------------------------*/


    System.out.println();

  }


  /** LinkedListProblemCallBack. */
  public void linkedListProblemCallBack() {

    /* Practicing LinkedList Basic operation. */
    PracticeLinkedList practiceLinkedList = new PracticeLinkedList();
    practiceLinkedList.addFirst("a");
    practiceLinkedList.addFirst("is");

    /* printing LinkedList */
    // pLinkedList.printList();

    /* addLast */
    practiceLinkedList.addLast("LinkedList");
    practiceLinkedList.addLast("List");
    practiceLinkedList.addFirst("This");
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