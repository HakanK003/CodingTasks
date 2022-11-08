package fromLeetCode.easy;

public class PalindromeNumber {

    //TODO Best is the 7th (also 5th is great too)

    //1
    //Runtime: 17 ms, faster than 33.03% of Java online submissions for Palindrome Number.
    //Memory Usage: 44.8 MB, less than 45.03% of Java online submissions for Palindrome Number.
    public boolean isPalindrome(int x) {

        String number = ""+x;

        for (int i = 0, j=number.length()-1; i <number.length()/2 ; i++, j--) {

            if (number.charAt(i)!=number.charAt(j)){

                return false;

            }

        }

        return true;

    }

    //2
    //Runtime: 11 ms, faster than 85.84% of Java online submissions for Palindrome Number.
    //Memory Usage: 45 MB, less than 40.84% of Java online submissions for Palindrome Number.
    public boolean isPalindrome2(int x) {

        if (x<0){return false;}

        int reversed =0, temp=x;

        while (x>0){

            reversed = reversed*10 + (x%10);
            x=x/10;

        }

        return reversed==temp;

    }

    //3
    //Runtime: 25 ms, faster than 13.13% of Java online submissions for Palindrome Number.
    //Memory Usage: 46.7 MB, less than 12.36% of Java online submissions for Palindrome Number.
    public boolean isPalindrome3(int x) {

        StringBuilder plain = new StringBuilder(""+x);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(x+"");

    }


    //4
    //Runtime: 14 ms, faster than 58.13% of Java online submissions for Palindrome Number.
    //Memory Usage: 44.2 MB, less than 75.11% of Java online submissions for Palindrome Number.
    public boolean isPalindrome4(int x) {

        if (x<0){
            return false;
        } else if (x>0){

        int reversed =0, temp=x;

        while (x>0){

            reversed = reversed*10 + (x%10);
            x=x/10;

        }

        return reversed==temp;

        } else {
            return true;
        }

    }

    //5
    //Runtime: 9 ms, faster than 98.47% of Java online submissions for Palindrome Number.
    //Memory Usage: 41.9 MB, less than 87.22% of Java online submissions for Palindrome Number.
    public boolean isPalindrome5(int x) {

        if (x>0){

            int reversed =0, temp=x;

            while (x>0){

                reversed = reversed*10 + (x%10);
                x=x/10;

            }

            return reversed==temp;

        } else return x >= 0;

    }


    //6
    public boolean isPalindrome6(int x) {

        if (x>0){

            int reversed =0, temp=x;

            while (x>0){

                reversed = reversed*10 + (x%10);
                x/=10;

            }

            return reversed==temp;

        } else return x == 0;

    }

    //7
    //Runtime: 17 ms, faster than 33.03% of Java online submissions for Palindrome Number.
    //Memory Usage: 43.5 MB, less than 82.44% of Java online submissions for Palindrome Number.
    //Runtime: 9 ms, faster than 98.47% of Java online submissions for Palindrome Number.
    //Memory Usage: 41.9 MB, less than 87.22% of Java online submissions for Palindrome Number.
    //Runtime: 9 ms, faster than 98.47% of Java online submissions for Palindrome Number.
    //Memory Usage: 41.6 MB, less than 94.06% of Java online submissions for Palindrome Number.
    public boolean isPalindrome7(int x) {

        if (x>9){

            int reversed =0, temp=x;

            while (x>0){

                reversed = reversed*10 + (x%10);
                x/=10;

            }

            return reversed==temp;

        } else return x >= 0;

    }


    //8
    //Runtime: 14 ms, faster than 58.13% of Java online submissions for Palindrome Number.
    //Memory Usage: 44 MB, less than 79.21% of Java online submissions for Palindrome Number.
    //Runtime: 11 ms, faster than 85.84% of Java online submissions for Palindrome Number.
    //Memory Usage: 44.4 MB, less than 63.04% of Java online submissions for Palindrome Number.
    //Runtime: 13 ms, faster than 68.60% of Java online submissions for Palindrome Number.
    //Memory Usage: 44 MB, less than 77.56% of Java online submissions for Palindrome Number.
    public boolean isPalindrome8(int x) {

        if (x>9){

            int reversed =0, temp=x;

            while (x>0){

                reversed = reversed*10 + (x%10);
                x=x/10;

            }

            return reversed==temp;

        } else return x >= 0;

    }





}

