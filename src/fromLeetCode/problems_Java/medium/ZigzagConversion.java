package fromLeetCode.problems_Java.medium;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {

    public String convert(String s, int numRows) {

        String result = "";
        int i = 0;

        //all rows
        for (int n = numRows; n > 0; n--) {

            //each row
            result+=getLetters(s,n*2-2, i);

            //sliding for first letter
            i++;
        }

        return result;
    }

    public String getLetters (String str, int length, int index){

        String result ="";

        //each row
        for (; index < str.length(); index+=length*2-2) {

            if(index<0){continue;}
            result+=str.charAt(index);

        }

        return result;
    }

    public String convert2e(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        int idx = 0;
        boolean downDirection = false;
        for (char c : s.toCharArray()) {
            list.get(idx).append(c);
            if (idx == 0 || idx == numRows - 1) {
                downDirection = !downDirection;
            }
            idx += downDirection ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : list) {
            result.append(sb.toString());
        }
        return result.toString();
    }

}
