package fromLeetCode.easy;

/*
    Related Topics
    -> String
*/

public class LengthOfLastWord_58 {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Length of Last Word.
    //Memory Usage: 40.4 MB, less than 93.42% of Java online submissions for Length of Last Word.
    public int lengthOfLastWord2(String s) {

        StringBuilder result = new StringBuilder();

        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i)==' '&&result.length()==0){
                continue;
            }else if (s.charAt(i)==' '){
                break;
            }

            result.append(s.charAt(i));
        }

        return result.length();

    }

    //Runtime: 1 ms, faster than 54.24% of Java online submissions for Length of Last Word.
    //Memory Usage: 42.3 MB, less than 37.84% of Java online submissions for Length of Last Word.
    public int lengthOfLastWord1(String s) {

        String[] words = s.split(" ");

        return words[words.length-1].length();

    }

}

//0ms
//
//    public int lengthOfLastWord(String s) {
//        String timmed = s.trim();
//
//        int i = timmed.lastIndexOf(" ");
//
//        if (i < 0) {
//            return timmed.length();
//        }
//
//        return timmed.substring(i + 1).length();
//     }


//39900kb
//
//    public int lengthOfLastWord(String s) {
//        int res = 0;
//        for(int i = s.length()-1;i>=0;i--){
//            if(s.charAt(i)==' ' && res!=0) return res;
//            else if(s.charAt(i)!=' ') res++;
//        }
//        return res;
//    }