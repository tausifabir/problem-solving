package solutions;

public class ValidParentheses {

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
    public boolean isValid(String s) {
        String[] strs = {"(", ")", "[", "]", " {", "}"};
        String strs2 = "()[]{}";

        for (int i = 0; i < strs2.length(); i++) {
            if (s.length() == 1) {
                if (s.charAt(i) == strs2.charAt(i)) {
                    System.out.println("s is matched " + s.charAt(i) + "=" + strs2.charAt(i));
                    return true;
                } else if (s.charAt(i) == strs2.charAt(i + 2)) {
                    System.out.println("s is matched " + s.charAt(i) + "=" + strs2.charAt(i + 2));
                    return true;
                } else if (s.charAt(i) == strs2.charAt(i + 4)) {
                    System.out.println("s is matched " + s.charAt(i) + "=" + strs2.charAt(i + 4));
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
