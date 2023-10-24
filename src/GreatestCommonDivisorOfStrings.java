public class GreatestCommonDivisorOfStrings {

    /*
     For two strings s and t, we say "t divides s" if
     and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
     Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

     Example 1:
     ------------------------------
     ------------------------------
     Input: str1 = "ABCABC", str2 = "ABC"
     Output: "ABC"
     ------------------------------

     Example 2:
     ------------------------------
     ------------------------------
     Input: str1 = "ABABAB", str2 = "ABAB"
     Output: "AB"
     ------------------------------

     Example 3:
     ------------------------------
     ------------------------------
     Input: str1 = "LEET", str2 = "CODE"
     Output: ""
     ------------------------------

    */

    // TODO: this approach is not working
    public String gcdOfStrings(String str1, String str2) {


        String firstTwoCharacter = getFirstTwoCharacterString(str1,str2);

        if(str1.length() %2 == 0 && str2.length() %2 == 0){

            if(str1.length() < str2.length()){
                for(int i = 2; i < str1.length(); i +=2){
                    if(!firstTwoCharacter.equals(str1.substring(0,2))){
                        return "";
                    };
                }

                for(int i = 0; i<str2.length(); i +=2){
                    if(!firstTwoCharacter.equals(str2.substring(0,i+2))){
                        return "";
                    };
                }
            } else if (str2.length() < str1.length()) {
                for(int i = 2; i < str2.length(); i +=2){
                    if(!firstTwoCharacter.equals(str2.substring(0,2))){
                        return "";
                    };
                }

                for(int i = 0; i < str1.length(); i +=2){
                    if(!firstTwoCharacter.equals( str1.substring(i,i+2) )){
                        return "";
                    };
                }
            }

        }else {
            return "";
        }

        return firstTwoCharacter;
    }

    private String getFirstTwoCharacterString(String str1, String str2){
        if(str2.length() < str1.length()){
            return str2.substring(0,2);
        }else{
           return str1.substring(0,2);
        }
    }


    public String gcdOfStringsV2(String str1, String str2) {
        if(str1.length() < str2.length()){
            gcdOfStringsV2(str2,str1);
        }else if(!str1.startsWith(str2)){
            return "";
        }else if (str2.isEmpty()) {
            return str1;
        }
        return gcdOfStringsV2(str2,mod(str1,str2));
    }

    private String mod(String s1, final String s2) {
        while (s1.startsWith(s2)){
            s1 = s1.substring(s2.length());
        }
        return s1;
    }
}
