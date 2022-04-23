package programmingLab.part4_string;

import java.util.Scanner;

public class StringNoEnd {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //Write your code here:
        s.close();

        txt=txt.substring(0,(txt.length()-1));

        System.out.println(txt);

    }

}

/*
Given a String txt print the value without the last letter

Ex:

Input:
foo
Output:
fo

Input:
run
Output:
ru
Hint: Use substring() and length()
 */