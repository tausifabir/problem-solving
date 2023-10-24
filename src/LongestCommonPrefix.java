public class LongestCommonPrefix {


    /*
     * Write a function to find the longest common prefix string amongst an array of strings.
     * If there is no common prefix, return an empty string "".
     * -------------------------------------------------------
     * Example 1:
     * Input: strs = ["flower","flow","flight"]
     * Output: "fl"
     * --------------------------------------------------------
     * Example 2:
     * Input: strs = ["dog","racecar","car"]
     * Output: ""
     * Explanation: There is no common prefix amongst the input strings.
     * ---------------------------------------------------------
     * */
    public String longestCommonPrefix(String[] strs) {

        if (strs.length < 0) return "";
        String firstElement = strs[0];

        for (int j = 1; j < strs.length; j++) {
            while (strs[j].indexOf(firstElement) != 0) {
                firstElement = firstElement.substring(0, firstElement.length() - 1);
            }
        }
        return firstElement;
    }
}
