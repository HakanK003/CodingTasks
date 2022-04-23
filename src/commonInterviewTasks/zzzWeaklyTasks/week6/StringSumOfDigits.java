package commonInterviewTasks.zzzWeaklyTasks.week6;

public class StringSumOfDigits {

    public static void main(String[] args) {

        String str1 = "123";

        System.out.println("sumIfOfDigitsFromString(str1) = " + sumIfOfDigitsFromString(str1));

        String str2 = "a2b3b4z55n5k";

        System.out.println("sumIfOfDigitsFromString(str2) = " + sumIfOfDigitsFromString(str2));


    }


    public static int sumIfOfDigitsFromString(String str){

        int sum =0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))){
                sum+= Integer.parseInt(""+str.charAt(i));
            }

        }

        return sum;
    }


}

/*
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
 */