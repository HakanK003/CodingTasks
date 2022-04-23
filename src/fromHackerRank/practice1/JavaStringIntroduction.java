package fromHackerRank.practice1;

/*
The first line contains a string A. The second line contains another string B.
The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of A and B.
For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.

Sample Input 0

hello
java
Sample Output 0

9
No
Hello Java
 */

import java.util.Arrays;
import java.util.Scanner;

public class JavaStringIntroduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        String[] arr = new String[2];

        arr[0]=A;
        arr[1]=B;

        Arrays.sort(arr);

        String result=A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1);

        System.out.println(A.length()+B.length());
        if(arr[0].equals(A)){System.out.println("No");}else{System.out.println("Yes");}
        System.out.println(result);

    }

}
