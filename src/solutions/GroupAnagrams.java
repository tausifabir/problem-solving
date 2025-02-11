package solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroupAnagrams {

  /*

    Given an array of strings strs, group the anagrams together. You can return the answer in any order.
    The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases,
    more than once.



    Example 1:
    ------------------------------
    ------------------------------
    Input: strs = ["eat","tea","tan","ate","nat","bat"]
    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    Explanation:
    There is no string in strs that can be rearranged to form "bat".
    The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
    The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other..
    ------------------------------

    Example 2:
    ------------------------------
    ------------------------------
    Input:  strs = [""]
    Output: [[""]]
    ------------------------------


    Example 3:
    ------------------------------
    ------------------------------
    Input: strs = ["a"]
    Output: [["a"]]
    ------------------------------


    Constraints:
    ------------------------------
    ------------------------------
    1 <= strs.length <= 104
    0 <= strs[i].length <= 100
    strs[i] consists of lowercase English letters.
  */



  // Runtime : 5ms, Memory : 41.9MB.
  //primary thoughtful process 1st approach. Time Limit Exceeded.
  /** kidsWithCandies. */
  public List<List<String>> groupAnagrams(String[] strs) {
      List<String> result = new ArrayList<>();
      List<String> returnList = new ArrayList<>();
      return Collections.singletonList(result);
  }
}
