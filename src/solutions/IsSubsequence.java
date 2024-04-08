package solutions;

import java.util.HashMap;

public class IsSubsequence {


      /*
       Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
       A subsequence of a string is a new string that is formed from the original string by deleting
       some (can be none) of the characters without disturbing the relative positions of the remaining characters.
       (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

      Example 1:
      ------------------------------
      ------------------------------
      Input: s = "abc", t = "ahbgdc"
      Output: true
      ------------------------------

      Example 2:
      ------------------------------
      ------------------------------
      Input: s = "axc", t = "ahbgdc"
      Output: false
      ------------------------------
      ------------------------------


      Example 3:
      ------------------------------
      ------------------------------
      Input: s = "ace", t = "abcde"
      Output: true
      ------------------------------
      ------------------------------

      Example 4:
      ------------------------------
      ------------------------------
      Input: s = "ace", t = "cbade"
      Output: false
      ------------------------------
      ------------------------------

      Example 5:
      ------------------------------
      ------------------------------
      Input: s = "ab", t = "baab"
      Output: true
      ------------------------------
      ------------------------------

      ------------------------------

      Constraints:
      ------------------------------
      ------------------------------
      0 <= s.length <= 100
      0 <= t.length <= 104
      s and t consist only of lowercase English letters.
      ------------------------------
      Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 109,
      and you want to check one by one to see if t has its subsequence.
      In this scenario, how would you change your code?
   */


  // 17 / 20 testcases passed.
  /** primary thoughtful process 1st approach.*/
  public boolean isSubsequence(String s, String t) {

    StringBuilder s1 = new StringBuilder("");
    HashMap<Character, Character> characterHashMap = new HashMap<>();

    for(int i = 0; i < s.length(); i++) {
      characterHashMap.put(s.charAt(i), s.charAt(i));
    }


    for(int i = 0; i < t.length(); i++) {

      if(characterHashMap.containsValue(t.charAt(i))) {
        s1.append(t.charAt(i));
      }
    }

    return s.equals(String.valueOf(s1));

  }


  // Runtime : 2ms, Memory : 42MB.
  /** primary thoughtful process 2nd approach.*/
  public boolean isSubsequenceV2(String s, String t) {

    int indexS = 0;
    int indexT = 0;

    while (indexT < t.length()) {
      if (!s.isEmpty()
          && indexS < s.length()
          && t.charAt(indexT) == s.charAt(indexS)
      ) {
        indexS++;
      }
      indexT++;
    }
    return s.length() == indexS;
  }


  // Runtime : 0ms, Memory : 42MB.
  /** Best Solution V1.*/
  public boolean isSubsequenceV3(String s, String t) {

    char[] sArr = s.toCharArray();
    char[] tArr = t.toCharArray();

    int i=0, j=0;
    while(i<sArr.length && j<tArr.length) {
      if(sArr[i] == tArr[j]) i++;
      j++;
    }

    return (i==sArr.length);
  }

  // Runtime : 1ms, Memory : 42MB.
  /** Best Solution V2.*/
  public boolean isSubsequenceV4(String s, String t) {


    loop1:
    for (int i = 0, j = 0; i < s.length(); i++) {
      for (; j < t.length(); j++) {
        if (t.charAt(j) == s.charAt(i)) {
          j++;
          continue loop1;
        }
      }
      return false;
    }
    return true;
  }


  // Runtime : 2ms, Memory : 42MB.
  /** Best Solution V3 .*/
  public boolean isSubsequenceV5(String s, String t) {
    short i = 0;
    short j = 0;

    while (i < s.length() && j < t.length()) {
      if (s.charAt(i) == t.charAt(j)) {
        i++;
      }
      j++;
    }

    return i == s.length();
  }

}
