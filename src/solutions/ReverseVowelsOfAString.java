package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowelsOfAString {

  /*

    Given a string s, reverse only all the vowels in the string and return it.
    The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases,
    more than once.



    Example 1:
    ------------------------------
    ------------------------------
    Input: s = "hello"
    Output: "holle"
    ------------------------------

    Example 2:
    ------------------------------
    ------------------------------
    Input: s = "leetcode"
    Output: "leotcede"
    ------------------------------


    Constraints:
    ------------------------------
    ------------------------------
    1 <= s.length <= 3 * 105
    s consist of printable ASCII characters.
  */

  /*
   * Runtime : 8ms, Memory : 43.10MB
   */
  /** ReverseVowels.*/
  public String reverseVowels(String s) {

    char [] replaceVowels = s.toCharArray();
    List<Character> reverseVowels = new ArrayList<>();

    for (int i=0; i < s.length(); i++) {
      if (checkCharacterIsVowels(s.charAt(i))) {
        reverseVowels.add(s.charAt(i));
      }
    }

    for (int i=0; i < s.length(); i++) {
      boolean isVowel = checkCharacterIsVowels(replaceVowels [i]);
      if (isVowel) {
        replaceVowels [i] = reverseVowels.get(reverseVowels.size() - 1);
        reverseVowels.remove(reverseVowels.size() - 1);
      }
    }

    return new String(replaceVowels);
  }

  /** checkCharacterIsVowels.*/
  public boolean checkCharacterIsVowels(Character c) {
    return c.equals('a') || c.equals('e') || c.equals('i') || c.equals('o') || c.equals('u')
        ||  c.equals('A')  || c.equals('E') || c.equals('I') || c.equals('O') || c.equals('U');

  }
}
