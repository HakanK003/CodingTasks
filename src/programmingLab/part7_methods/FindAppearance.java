package programmingLab.part7_methods;

import java.util.Scanner;

public class FindAppearance {

    public static int countAppearance(String[] arr,String t){

        int count =0;
        for(String each : arr){
            if(each.equals(t)){count++;}
        }

        return count;
    } //end  count_appearance




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        String word = in.next();
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(countAppearance(strs,word));
        in.close();

    }

}

/*
Create a method that has two parameters of an array of strings and a string and should return an int.

It counts how many times the given string appears in the array and returns the count.

for example (pseudo code):

array = ["a","foo","bar","foo","bla"]
string = "foo"
countAppearance(array , string ) -> 2
 */