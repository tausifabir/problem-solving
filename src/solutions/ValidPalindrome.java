package solutions;

public class ValidPalindrome {

  /*
      A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing
      all non-alphanumeric characters, it reads the same forward and backward.
      Alphanumeric characters include letters and numbers.
      Given a string s, return true if it is a palindrome, or false otherwise.

      Example 1:
      ------------------------------
      ------------------------------
      Input: s = "A man, a plan, a canal: Panama"
      Output: true
      Explanation: "amanaplanacanalpanama" is a palindrome.
      ------------------------------

      Example 2:
      ------------------------------
      ------------------------------
      Input: s = "race a car"
      Output: false
      Explanation: "raceacar" is not a palindrome.
      ------------------------------

      Example 3:
      ------------------------------
      ------------------------------
      Input: s = " "
      Output: true
      Explanation: s is an empty string "" after removing non-alphanumeric characters.
      Since an empty string reads the same forward and backward, it is a palindrome.
      ------------------------------

      Constraints:
      ------------------------------
      ------------------------------
      1 <= s.length <= 2 * 105
      s consists only of printable ASCII characters
      ------------------------------

   */


  // Runtime : 25ms, Memory : 45MB.
  /** primary thoughtful process 1st approach.*/
  public boolean isPalindrome(String s) {
    s = s.toLowerCase();
    s = s.trim();
    s = s.replaceAll("[^a-zA-Z0-9]", "");
    s = s.replaceAll("\\s", "");
    char[] sArr = s.toCharArray();
    int size = sArr.length;
    StringBuilder s1 = new StringBuilder();

    for (int i = size-1; i >= 0; i--) {
      s1.append(sArr[i]);
    }

    System.out.println("given " +s);
    System.out.println("made  " +s1);
    for (int i = 0; i < size; i++) {
      if (s.charAt(i) != s1.charAt(i)) {
          return false;
      }
    }

    return true;
  }


  // Runtime : 13ms, Memory : 45MB.
  /** Best Easy Readable Solution V1.*/
  public boolean isPalindromeV1(String s) {

    s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

    int start = 0;
    int end = s.length() - 1;
    while (start < end) {
      if (s.charAt(start) == s.charAt(end)) {
        start++;
        end--;
      } else {
        return false;
      }
    }

    return true;
  }


  // Runtime : 1ms, Memory : 45MB.
  /** Best Efficient Solution V2.*/
  public boolean isPalindromeV2(String s) {

    int frontIndex = 0;
    int rearIndex = s.length() - 1;
    char frontChar, rearChar;

    while (frontIndex < rearIndex) {

      frontChar = getLowerCaseChar(s.charAt(frontIndex));
      rearChar = getLowerCaseChar(s.charAt(rearIndex));

      while (frontIndex < rearIndex && frontChar == '!') {

        frontIndex++;
        frontChar = getLowerCaseChar(s.charAt(frontIndex));

      }

      while (frontIndex < rearIndex && rearChar == '!') {
        rearIndex--;
        rearChar = getLowerCaseChar(s.charAt(rearIndex));
      }

      if (frontIndex == rearIndex) {
        return true;
      } else if (frontChar != rearChar) {
        return false;
      }

      frontIndex++;
      rearIndex--;

    }

    return true;
  }


  private char getLowerCaseChar(char c) {
    if(c >= 'A' && c <= 'Z') {
      return (char) (c + ('a' - 'A'));
    }

    if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
      return c;
    }

    return '!';
  }
}
