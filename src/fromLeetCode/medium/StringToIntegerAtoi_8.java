package fromLeetCode.medium;

public class StringToIntegerAtoi_8 {

    public int myAtoi(String s) {

        int result =0;
        boolean minus =false;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i)=='-'&&Character.isDigit(s.charAt(i+1))){

                result= result*10 + s.charAt(i);

            }

        }

        return result;
    }

}
