package fromLeetCode.medium;

public class ReverseInteger {

    /**
     *    Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
     */

     public int reverseL(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public int reverse2(int x) {

        int result = 0;

        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result)
                return 0;
            result = newResult;
            x = x / 10;
        }

        return result;

    }

    //        return (x>0)? x+Integer.MAX_VALUE :(x<0)? x+Integer.MAX_VALUE : 0;

    public int reverse(int x) {

        int a =x;
        int reversed = 0;

        while(x!=0){

            reversed = (reversed*10)+x%10;
            x/=10;

        }

        return ((a>0&&reversed>0) || (a<0&&reversed<0))? reversed : 0 ;

    }

}
