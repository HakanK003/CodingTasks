package programmingLab.part7_methods;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
        in.close();
    }

    public static String uniqueChars(String str) {
        //write your code
        String result ="";
        for(int i=0; i<str.length(); i++){
            if(!result.contains(""+str.charAt(i))){result+=""+str.charAt(i);}
        }
        return result;
    }

}

/*
uniqueChars is a method that will accept any String and return the String with out any duplicate characters

Examples:

uniqueChars("java") ==> "jav"
uniqueChars("mama") ==> "ma"
uniqueChars("spoon") ==> "spon"
 */