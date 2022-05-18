package fromHackerRank.javaPractices.practice4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner input = new Scanner(System.in);

        String sentence = input.nextLine();

        input.close();

        Character[] dividers = {' ','.',',',';','/','\'','\\',':','?','-','_','(',')','[',']','{','}','*','&','^','%','$','#','@','!','`','~','<','>','\"','+','|'};

        ArrayList<String> words =new ArrayList<> (Arrays.asList( sentence.split( Arrays.toString(dividers) ) ) );

        words.removeIf(x -> x.isBlank()||x.isEmpty());

        System.out.println(words.size());

        for (String each : words) {
            System.out.println(each);
        }


    }

}
