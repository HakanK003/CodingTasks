package fromHackerRank.javaPractices.practice3;

/*
Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints

A will consist at most 50 lower case english letters.
Sample Input

madam
Sample Output

Yes
 */

import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner input = new Scanner(System.in);

        String word = input.next();

        String reversed="";

        for(int i=word.length()-1; i>=0; i--){
            reversed+=""+word.charAt(i);
        }

        System.out.println( (word.equals(reversed))?"Yes":"No" );


    }

}
