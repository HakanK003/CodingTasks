package programmingLab.part7_methods;

import java.util.Scanner;

public class ReverseString {

    public static String reverse(String input){
        String reversed="";
        for(int i =input.length()-1; i>=0; i--){
            reversed+=""+input.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));
        in.close();
    }

}

/*
he reverse method will reverse the given String

Example:

reverse("foo") ==> "oof"
reverse("student") ==> "tneduts"
 */