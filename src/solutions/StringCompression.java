package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringCompression {

  /*
      Given an array of characters chars, compress it using the following algorithm:
      Begin with an empty string s. For each group of consecutive repeating characters in chars:
      If the group's length is 1, append the character to s.
      Otherwise, append the character followed by the group's length.
      The compressed string s should not be returned separately, but instead,
      be stored in the input character array chars.
      Note that group lengths that are 10 or longer will be split into multiple characters in chars.
      After you are done modifying the input array, return the new length of the array.
      You must write an algorithm that uses only constant extra space.

      Example 1:
      ------------------------------
      ------------------------------
      Input: chars = ["a","a","b","b","c","c","c"]
      Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
      Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
      ------------------------------

      Example 2:
      ------------------------------
      ------------------------------
      Input: chars = ["a"]
      Output: Return 1, and the first character of the input array should be: ["a"]
      Explanation: The only group is "a", which remains uncompressed since it's a single character.
      ------------------------------

      Example 3:
      ------------------------------
      ------------------------------
      Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
      Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
      Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
      ------------------------------
      ------------------------------
      ------------------------------
      Constraints:

      1 <= chars.length <= 2000
      chars[i] is a lowercase English letter, uppercase English letter, digit, or symbol.
    */


  /** compress primary thoughtful process .*/
  public int compress(char[] chars) {

    Set<Character> characterSet = new HashSet<>();
    char[] chars2 = new char[chars.length];
    int index = 0;
    for (char i : chars) {
      characterSet.add(i);
    }

    for (char uniqueChar : characterSet) {
      int count = 0;
      for (int j = 0; j < chars.length - 1; j++) {
        if (uniqueChar == chars[j]) {
          count++;
        }
      }

      chars2[ index++ ] = uniqueChar;
      if (count > 1) {
        char[] countChars = Integer.toString(count).toCharArray();
        for (char c : countChars) {
          chars2[index++] = c;
        }
      }

    }
    System.arraycopy(chars2, 0, chars, 0, index);

    return index;
  }


  /** compress primary thoughtful process .*/
  public int compressV2(char[] chars) {

    Set<Character> characterSet = getCharacterSet(chars);

    if (characterSet != null
        && characterSet.size() == 1) {
      return characterSet.size();
    }
    Map<Character, Integer> countMap = new HashMap<>();
    int index = 0;


    char[] uniChars = new char[characterSet.size()];


    for (Character c : characterSet) {
      uniChars[index++] = c; // Add each character from the set to the char array
    }

    System.out.println(uniChars);

    for (int i = 0; i < uniChars.length; i++) {
      int count = 0;
      for (int j = 0; j < chars.length; j++) {
        if (uniChars[i] == chars[j]) {
          count++;
          countMap.put(uniChars[i], count);
          System.out.println(count + " for " + uniChars[i]);
        }
      }
    }



    List<String> sortedChars = new ArrayList<>();
    for (Character c : uniChars) {

      int value = countMap.get(c);
      sortedChars.add(c.toString());
      if (value > 1) {
        sortedChars.add(String.valueOf(value));
      }

    }

    System.out.println(sortedChars);
    List<String> stringList = Arrays.asList(sortedChars.toString());
    int totalLength = 0;
    for (String str : stringList) {
      totalLength += str.length();
    }

    chars = new char[totalLength];
    int index1 = 0;
    for (String str : stringList) {
      char[] strChars = str .toCharArray();
      for (char c : strChars) {
        chars[index1++] = c;
      }
    }

    System.out.println(sortedChars);
    return sortedChars.size();
  }


  private Set<Character> getCharacterSet(char[] chars) {

    if (chars.length > 0) {
      Set<Character> characterSet = new HashSet<>();
      for (char i : chars) {
        characterSet.add(i);
      }
      return characterSet;
    }

    return null;
  }
}
