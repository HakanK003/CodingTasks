package fromHackerRank.javaPractices.practice3;

/*

Input Format
There are two lines of input. The first line contains : the breadth of the parallelogram.
The next line contains : the height of the parallelogram.

Output Format
If both values are greater than zero, then the main method must output the area of the parallelogram.
Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1
1
3
Sample output 1
3

Sample input 2
-1
2
Sample output 2
java.lang.Exception: Breadth and height must be positive

 */

import java.util.Scanner;

public class JavaStaticInitializerBlock {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        if(a>0&&b>0){System.out.println(a*b);}else{System.out.println("java.lang.Exception: Breadth and height must be positive");}

    }

}
