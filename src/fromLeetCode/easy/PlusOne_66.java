package fromLeetCode.easy;

/*
    Related Topics
    -> Array
    -> Math
*/

public class PlusOne_66 {

    public int[] plusOne2(int[] digits) {

        for (int i = digits.length-1; i >-1; i--) {

            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }

            digits[i]= 0;
        }

        int[] result= new int[digits.length+1];
        result[0]=1;

        return result;

    }


    public static int[] plusOne1(int[] digits) {

        int tail = digits.length - 1;

        if (digits[tail] != 9) {
            digits[tail] = digits[tail] + 1;
            return digits;
        }

        while (tail > -1 && digits[tail] == 9) {

            digits[tail] = (digits[tail] + 1) % 10;
            tail--;
        }

        if (tail == -1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        } else {
            digits[tail] = (digits[tail] + 1) % 10;
        }

        return digits;
    }

}
