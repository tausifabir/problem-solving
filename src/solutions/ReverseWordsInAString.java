package solutions;

import java.util.ArrayList;
import java.util.List;

/** ReverseWordsInAString. */
public class ReverseWordsInAString {

  /*
  Given an input string s, reverse the order of the words.
  A word is defined as a sequence of non-space characters.
  The words in s will be separated by at least one space.
  Return a string of the words in reverse order concatenated by a single space.
  Note that s may contain leading or trailing spaces or multiple spaces between two words.
  The returned string should only have a single space separating the words. Do not include any extra spaces.



  Example 1:
  ------------------------------
  ------------------------------
  Input: s = "the sky is blue"
  Output: "blue is sky the"
  ------------------------------

  Example 2:
  ------------------------------
  ------------------------------
  Input: s = "  hello world  "
  Output: "world hello"
  Explanation: Your reversed string should not contain leading or trailing spaces.
  ----------------------------------------

  Example 3:
  ------------------------------
  ------------------------------
  Input: s = "a good   example"
  Output: "example good a"
  Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
  ------------------------------------


   Constraints:
   ------------------------------
   1 <= s.length <= 104
   s contains English letters (upper-case and lower-case), digits, and spaces ' '.
   There is at least one word in s.
   Follow-up: If the string data type is mutable in your language,
   can you solve it in-place with O(1) extra space?

   */

  /*
   * Runtime : 26ms, Memory : 44.43MB
   */

  /** reverseWords.*/
  public String reverseWords(String s) {

    s = s.trim();

    String replaceString = "";

    String storeTempString = "";

    int length = s.length()-1;

    int countSpace = 0;

    if (!s.isEmpty()) {

      for (int i = length; i >= 0; i--) {

        if (i == 0) {

          storeTempString = storeTempString + String.valueOf(s.charAt(i)) + " ";
          replaceString = reserveWorld(storeTempString, replaceString);
          storeTempString = "";

        } else if (!checkCharacterIsWhiteSpace(s.charAt(i))) {

          storeTempString = storeTempString + String.valueOf(s.charAt(i));

        } else if (checkCharacterIsWhiteSpace(s.charAt(i))) {

          if (!replaceString.isEmpty() && checkCharacterIsWhiteSpace(s.charAt(i+1))) {
            continue;
          } else {
            storeTempString = storeTempString.trim() + String.valueOf(s.charAt(i));
            replaceString = reserveWorld(storeTempString, replaceString);
            storeTempString = "";
            countSpace++;
          }

        }

      }
    }


    return replaceString.trim();
  }

  public boolean checkCharacterIsWhiteSpace(Character c) {
    return c.equals(' ');
  }

  /** reserveWorld. */
  public String reserveWorld(String returnString, String passString) {

    returnString.trim();

    int length = returnString.length()-1;

    for (int i = length; i >= 0; i--) {
      passString = passString + String.valueOf(returnString.charAt(i));

    }


    return passString;
  }

}
