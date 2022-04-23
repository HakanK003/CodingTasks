package programmingLab.part7_methods;

import java.util.Scanner;

public class StringCountLetters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
        in.close();
    }

    public static String countLetters(String str){
        String result="";
        for(int i=0; i<str.length(); i++){
            int count =0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){count++;}
            }
            if(!result.contains(str.charAt(i)+"")){result+=""+count+str.charAt(i);}
        }
        return result;
    }

}

/*
Write a method countLetters that can count letters in a given string and return a new string in the given format:

number of letters + letter

Example:

input: countLetters("aaabbcccc");
output: "3a2b4c"
 */