package fromLeetCode.problems_Java.medium;

public class BreakAPalindrome_1328 {


    //Runtime: 2 ms, faster than 20.52% of Java online submissions for Break a Palindrome.
    //Memory Usage: 42.8 MB, less than 7.81% of Java online submissions for Break a Palindrome.
    public String breakPalindrome4(String palindrome) {

        if (palindrome.length()==1) return "";

        char[] letters = palindrome.toCharArray();

        return (letters[0]=='a'&&(letters[1]=='a'||letters.length<=3))? palindrome.substring(0,palindrome.length()-1)+"b" : palindrome.replaceFirst("[b-z]","a");


    }


    //Runtime: 2 ms, faster than 20.52% of Java online submissions for Break a Palindrome.
    //Memory Usage: 42.1 MB, less than 50.43% of Java online submissions for Break a Palindrome.
    public String breakPalindrome3(String palindrome) {

        if (palindrome.length()==1) return "";

        return (palindrome.charAt(palindrome.length()-1)=='a'&&(palindrome.charAt(1)=='a'||palindrome.length()<=3))? palindrome.substring(0,palindrome.length()-1)+"b" : palindrome.replaceFirst("[b-z]","a");


    }

    //Runtime: 2 ms, faster than 20.52% of Java online submissions for Break a Palindrome.
    //Memory Usage: 42.2 MB, less than 42.02% of Java online submissions for Break a Palindrome.
    public String breakPalindrome2(String palindrome) {

        if (palindrome.length()==1) return "";

        if (palindrome.charAt(palindrome.length()-1)=='a'&&(palindrome.charAt(1)=='a'||palindrome.length()<=3)) return palindrome.substring(0,palindrome.length()-1)+"b";

        return palindrome.replaceFirst("[b-z]","a");

    }


    //Runtime: 9 ms, faster than 7.35% of Java online submissions for Break a Palindrome.
    //Memory Usage: 42.8 MB, less than 7.81% of Java online submissions for Break a Palindrome.
    public String breakPalindrome(String palindrome) {

        if (palindrome.length()==1) return "";

        if (palindrome.charAt(0)!='a') return "a"+palindrome.substring(1);
        if (palindrome.charAt(1)!='a'&&palindrome.length()>3) return palindrome.charAt(0)+"a"+palindrome.substring(2);

        return palindrome.substring(0,palindrome.length()-1)+"b";
    }

}

/*
TODO 0ms sample solution

    public String breakPalindrome(String palindrome) {
        int length = palindrome.length();
        if(length == 1){
            return"";
        }
        char[] containArray = palindrome.toCharArray();
        for(int i = 0; i < length/2; i++){
            if(containArray[i] != 'a'){
                containArray[i] = 'a';
                return String.valueOf(containArray);
            }
        }
         containArray[length - 1] = 'b';
        return String.valueOf(containArray);

    }

TODO 39750kb sample solution

    public String breakPalindrome(String palindrome) {
        StringBuilder sb = new StringBuilder();
        if (palindrome.length() == 1) return sb.toString();
        int pos = -1;
        for (int i = 0; i < palindrome.length(); i++) {
            char ch = palindrome.charAt(i);
            if (ch != 'a' && pos == -1 && 2 * i + 1 != palindrome.length()) {
                pos = i;
                sb.append('a');
            } else {
                sb.append(ch);
            }
        }
        if (pos == -1) {
            sb.deleteCharAt(sb.length() - 1);
            sb.append('b');
        }
        return sb.toString();
    }

 */