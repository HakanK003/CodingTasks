package programmingLab.part4_string;

import java.util.Scanner;

public class MergeThem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WRITE YOUR CODE HERE:
        scan.close();

        String result = (word1.length()==3&&word2.length()==3)?
                ((""+word1.charAt(0)+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+word1.charAt(2)+word2.charAt(2))) : ("cannot merge");

        System.out.println(result);


    }

}

/*
You have 2 words, both of them have 3 characters.

If either of them does not have exactly 3 characters, print "cannot merge"

Merge their characters one by one and print together like below:

Input:
aok
lol
Output:
alookl

Input:
ear
pie
Output:
epaire

Input:
java
wow
Output:
cannot merge

hint:
by inserting +""+ (empty string) between chars, you can concatenate char values.
 */