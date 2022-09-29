package fromLeetCode.medium;

public class LongestPalindromicSubstring {


    //expanding approach
    //Runtime: 42 ms, faster than 54.02% of Java online submissions for Longest Palindromic Substring.
    //Memory Usage: 52.2 MB, less than 34.76% of Java online submissions for Longest Palindromic Substring.
    public String longestPalindrome3(String s) {

        if (s == null || s.length() < 2) {
            return s;
        }

        String result = "";

        for (int i = 0; i < s.length() - 1; i++) {
            //for odd length
            String str1 = getPalin(s, i, i);
            //for even length
            String str2 = getPalin(s, i, i + 1);
            if (str1.length() > result.length()) {
                result = str1;
            }
            if (str2.length() > result.length()) {
                result = str2;
            }
        }

        return result;
    }

    private String getPalin(String s, int l , int r) {

        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }

        return s.substring(l + 1, r);

    }



    public String longestPalindrome2(String s) {

        String resultRight = "";
        String resultLeft = "";
        int centers = (s.length()*2)-1;

        for (int i = centers, j = centers; i >= 0 ; i++, j--) {

            for (int k = 0; k < i/2; k++) {

                if(s.charAt(i+k)==s.charAt(i-k)) {
                    resultRight+=s.charAt(i+k);
                }

                if(s.charAt(j+k)==s.charAt(j-k)) {
                    resultLeft+=s.charAt(j+k);
                }

            }

        }

        return (resultLeft.length()>resultRight.length())? resultLeft : resultRight ;

    }


    //Time Limit Exceeded
    public String longestPalindrome1(String s) {

        for (int i = s.length(); i >0; i--) {

            for (int j = 0; j < s.length()-i; j++) {
                String current = s.substring(j,j+i+1);
                String reverse = "";

                for (int k = current.length(); k >0 ; k--) {
                    reverse+=current.charAt(k-1)+"";
                }
                if (current.equals(reverse)){
                    return current;
                }
            }

        }

        return s.charAt(0)+"";
    }

}
