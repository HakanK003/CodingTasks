package fromHackerRank.practice3;

/*
Sample Input 0

welcome to java
3
Sample Output 0

ava
wel
Explanation 0

String  has the following lexicographically-ordered substrings of length :

We then return the first (lexicographically smallest) substring and the last (lexicographically largest)
substring as two newline-separated values (i.e., ava\nwel).

The stub code in the editor then prints ava as our first line of output and wel as our second line of output.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JavaSubstringComparisons {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        String word = input.next();
        int length = input.nextInt();

        ArrayList<String> newWords = new ArrayList<>();

        for(int i=0; i<word.length()-length;i++){
            newWords.add(word.substring(i,i+length));
        }

        Collections.sort(newWords);

        System.out.println(newWords.get(0));
        System.out.println(newWords.get(newWords.size()-1));


    }

}
