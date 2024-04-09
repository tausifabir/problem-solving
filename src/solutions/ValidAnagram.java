package solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedMap;

public class ValidAnagram {

  /*
      Given two strings s and t, return true if t is an anagram of s, and false otherwise.
      An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
      typically using all the original letters exactly once.

      Example 1:
      ------------------------------
      ------------------------------
      Input: s = "anagram", t = "nagaram"
      Output: true
      ------------------------------

      Example 2:
      ------------------------------
      ------------------------------
      Input: s = "rat", t = "car"
      Output: false
      ------------------------------
      ------------------------------

      Constraints:
      ------------------------------
      ------------------------------
      1 <= s.length, t.length <= 5 * 104
      s and t consist of lowercase English letters.
      ------------------------------
      Follow up: What if the inputs contain Unicode characters?
      How would you adapt your solution to such a case?
   */



  // Runtime : 27ms, Memory : 44MB.
  /** primary thoughtful process 1st approach.*/
  public boolean isAnagram(String s, String t) {

    if (s.length() != t.length()) {
      return false;
    }

    HashMap<Character, Integer> hashMap = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
      hashMap.put(t.charAt(i), hashMap.getOrDefault(t.charAt(i), 0) - 1);
    }

    for (int i : hashMap.values()) {
      if (i != 0) {
        return false;
      }
    }
    return true;
  }





  // TODO: Need to Understand this Solution
  // Runtime : 1ms, Memory : 46MB.
  /** Efficient run time.*/
  public boolean isAnagramV2(String s, String t) {

    int[] arr = new int[26];
    for (char ch : s.toCharArray()) {
      arr[ch - 'a']++;
    }
    for (char ch : t.toCharArray()) {
      arr[ch - 'a']--;
    }
    for (int val : arr) {
      if (val != 0) {
        return false;
      }
    }
    return true;
  }

}
