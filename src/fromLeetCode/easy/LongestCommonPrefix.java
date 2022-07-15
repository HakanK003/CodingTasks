package fromLeetCode.easy;

public class LongestCommonPrefix {


    public static void main(String[] args) {

        System.out.println(longestCommonPrefix5(new String[]{"flowererer", "flower", "flow", "flowht"}));

    }



    //Runtime: 3 ms, faster than 35.73% of Java online submissions for Longest Common Prefix.
    //Memory Usage: 41.9 MB, less than 69.36% of Java online submissions for Longest Common Prefix.
    public static String longestCommonPrefix(String[] strs) {

        String result = "";

        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < strs.length; i++) {

            if (strs[i].length()<minLength){minLength=strs[i].length();}

        }

        for (int i = 0; i < minLength; i++) {

            String point ="" + strs[0].charAt(i);

            for (int j = 0; j < strs.length; j++) {

                if (!("" + strs[j].charAt(i)).equals(point)){
                    point = "";
                    break;
                }

            }

            if (point.equals("")){
                break;
            }else {
                result += point;
            }

        }

        return result;
    }


    //Runtime: 4 ms, faster than 30.80% of Java online submissions for Longest Common Prefix.
    //Memory Usage: 43.7 MB, less than 7.73% of Java online submissions for Longest Common Prefix.
    public static String longestCommonPrefix2(String[] strs) {

        String result = "";
        boolean go = true;
        int index = 0;

        while(go && index<strs[0].length()){

            String point ="" + strs[0].charAt(index);

            for (int j = 0; j < strs.length; j++) {

                if (index>=strs[j].length() || !("" + strs[j].charAt(index)).equals(point)){
                    point = "";
                    go=false;
                    break;
                }

            }
            index++;
            result += point;

        }

        return result;

    }


    //Runtime: 4 ms, faster than 30.80% of Java online submissions for Longest Common Prefix.
    //Memory Usage: 43.9 MB, less than 7.58% of Java online submissions for Longest Common Prefix.
    public static String longestCommonPrefix3(String[] strs) {

        String result = "";
        boolean go = true;
        int index = 0;

        while(go && index<strs[0].length()){

            String point ="" + strs[0].charAt(index);

            for (String str : strs) {

                if (index >= str.length() || !("" + str.charAt(index)).equals(point)) {
                    point = "";
                    go = false;
                    break;
                }

            }
            index++;
            result += point;

        }

        return result;

    }


    //Runtime: 15 ms, faster than 12.30% of Java online submissions for Longest Common Prefix.
    //Memory Usage: 43.3 MB, less than 9.60% of Java online submissions for Longest Common Prefix.
    public String longestCommonPrefix4(String[] strs) {

        String result = "";
        int shortestLength = Integer.MAX_VALUE;
        String shortest = "";
        for (String each : strs) {
            if (each.length()<shortestLength) {
                shortestLength = each.length();
                shortest = each;
            }
        }
        for (int i = 0; i<shortestLength; i++) {
            for (int j=0; j < strs.length; j++) {
                if (shortest.charAt(i) != strs[j].charAt(i)) {
                    return result;
                }
            }
            result += shortest.charAt(i);
        }
        return result;



    }

    //Runtime: 4 ms, faster than 30.80% of Java online submissions for Longest Common Prefix.
    //Memory Usage: 44.2 MB, less than 7.37% of Java online submissions for Longest Common Prefix.
    public static String longestCommonPrefix5(String[] strs) {

        String result = "";

        for (int i = 0; i < strs[0].length(); i++) {

            String point ="" + strs[0].charAt(i);

            for (int j = 0; j < strs.length; j++) {

                if (i>=strs[j].length() || !("" + strs[j].charAt(i)).equals(point)){
                    return result;
                }


            }

            result += point;

        }

        return result;

    }

}
