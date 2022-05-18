package fromHackerRank.javaPractices.practice4;

import java.util.Scanner;

public class Java1DArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[input.nextInt()];

        for(int i = 0; i<arr.length; i++){
            arr[i]=input.nextInt();
        }
        input.close();

        for (int each : arr) {
            System.out.println(each);
        }

    }

}

/*
Input Format

The first line contains a single integer,n , denoting the size of the array.
Each line i of the n subsequent lines contains a single integer denoting the value of element a.

Output Format

You are not responsible for printing any output to stdout. Locked code in the editor loops through array a and
prints each sequential element on a new line.

Sample Input

5
10
20
30
40
50
Sample Output

10
20
30
40
50
 */