package solutions;

import java.util.ArrayList;
import java.util.List;

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

  public String reverseWords(String s) {
//    char [] replaceVowels = s.toCharArray();
    List<Character> reverseVowels = new ArrayList<>();
    String replaceString = s;
    String returnString = null;
    int length = s.length()-1;
    if(!s.isEmpty()){
      for (int i = length; i >= 0; i--){

        if (checkCharacterIsWhiteSpace(s.charAt(i))) {
             returnString = replaceString.substring(i);
        };

       /* if(i == 0 && !checkCharacterIsWhiteSpace(s.charAt(i))){
          returnString = replaceString.substring(0,0);
        }*/
      }
    }


    return returnString;
  }

  public boolean checkCharacterIsWhiteSpace(Character c){

    return c.equals(' ');


  }

}
