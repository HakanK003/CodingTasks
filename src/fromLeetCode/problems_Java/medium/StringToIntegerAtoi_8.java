package fromLeetCode.problems_Java.medium;

public class StringToIntegerAtoi_8 {



    public int myAtoi2(String s) {

        s = s.trim();
        if (s.isEmpty()) return 0;

        int i = 0, ans = 0, sign = 1, len = s.length();

        if (s.charAt(i) == '-' || s.charAt(i) == '+')
            sign = s.charAt(i++) == '+' ? 1 : -1;

        for (; i < len; ++i) {
            int tmp = s.charAt(i) - '0';
            if (tmp < 0 || tmp > 9)
                break;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && Integer.MAX_VALUE % 10 < tmp))
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            else
                ans = ans * 10 + tmp;
        }

        return sign * ans;

    }


    //Failed -> test case 1034 / 1082 -> Input:"-6147483648" | Output:-1852516352 | Expected: -2147483648
    public int myAtoi1(String s) {

        s = s.trim();
        int result = 0;
        boolean minus = false, skip1 = true;

        for (int i = 0; i < s.length(); i++) {

            if (skip1 && s.charAt(i) == '-') {
                minus = true;
                skip1 = false;
                continue;
            } else if (skip1 && s.charAt(i) == '+') {
                skip1 = false;
                continue;
            }


            if (Character.isDigit(s.charAt(i))) {

                int number = Integer.parseInt("" + s.charAt(i));

                if (minus) {

                    if (Math.abs(result * 10 - number )>= Math.abs(result)) {
                        result = result * 10 - number;
                    } else {
                        result = -2147483648;
                        break;
                    }

                } else {

                    if (result * 10 + number >= result) {
                        result = result * 10 + number;
                    } else {
                        result = 2147483647;
                        break;
                    }

                }

            } else {
                break;
            }


        }

        return result;
    }

}
