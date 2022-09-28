package fromLeetCode.medium;

public class LongestPalindromicSubstring {


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
