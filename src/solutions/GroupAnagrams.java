package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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



  // Runtime : 7ms, Memory : 48.9MB.
  //primary thoughtful process 1st approach. Time Limit Exceeded.
  /** groupAnagrams. */
  public List<List<String>> groupAnagrams(String[] strings) {


    Map<String, List<String>> map = new HashMap<>();

    for (String str : strings) {
      char[] chars = str.toCharArray();
      Arrays.sort(chars);
      String sortedMapKey = new String(chars);
      if (map.containsKey(sortedMapKey)) {
        map.get(sortedMapKey).add(str);
      } else {
        List<String> list = new ArrayList<>();
        list.add(str);
        map.put(sortedMapKey, list);
      }

    }

    List<List<String>> returnCollectionList = new ArrayList<>();

    for (String str : map.keySet()) {
      List<String> list = map.get(str);
      returnCollectionList.add(list);
    }

    return returnCollectionList;
  }
}
