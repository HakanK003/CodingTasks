package fromHackerRank.javaPractices.practice4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class IsAnagram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner input = new Scanner(System.in);

        String word1 = input.next();
        String word2 = input.next();

        input.close();

        System.out.println(isAnagram(word1, word2));

    }

    public static String isAnagram(String word1, String word2){

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        char[] word1Chars = word1.toCharArray();
        char[] word2Chars = word2.toCharArray();

        Arrays.sort(word1Chars);
        Arrays.sort(word2Chars);

        return (Arrays.equals(word1Chars, word2Chars))? "Anagrams":"Not Anagrams";

    }

    public static String isAnagram2(String word1, String word2){

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        ArrayList<Character> word1Chars = new ArrayList<>();
        for(int i =0; i<word1.length(); i++){
            word1Chars.add(word1.charAt(i));
        }

        ArrayList <Character> word2Chars = new ArrayList<>();
        for(int i =0; i<word2.length(); i++){
            word2Chars.add(word2.charAt(i));
        }

        Collections.sort(word1Chars);
        Collections.sort(word2Chars);

        return (word1Chars.equals(word2Chars))? "Anagrams":"Not Anagrams";

    }


}
