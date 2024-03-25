package solutions;

public class ReplaceElementsArray {

  /*
        Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
        determine if the input string is valid.
        An input string is valid if:
        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.

        Example 1:
        ------------------------------
        ------------------------------
        Input: s = "()"
        Output: true
        ------------------------------

        Example 2:
        ------------------------------
        ------------------------------
        Input: s = "()[]{}"
        Output: true
        ------------------------------

        Example 3:
        ------------------------------
        ------------------------------
        Input: s = "(]"
        Output: false
        ------------------------------

     */


  /** compress primary thoughtful process 1st approach .*/
  public int[] replaceElementsV1(int[] arr) {

    int max = arr[0];

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i+1; j < arr.length - 1; j++) {
        if (arr[j] > max) {
          max = arr[j];
        }
      }
      arr[i] = max;
      max = 0;
    }

    return arr;
  }
}
