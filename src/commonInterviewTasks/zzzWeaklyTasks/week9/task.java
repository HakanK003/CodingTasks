package commonInterviewTasks.zzzWeaklyTasks.week9;

public class task {

    public static void main(String[] args) {

        System.out.println(reverse("Hakan"));

        System.out.println("isPalindrome(\"abcba\") = " + isPalindrome("abcba"));

    }


    public static String reverse(String str){

        String reversed ="";

        for (int i = str.length()-1; i >=0 ; i--) {

            reversed+=str.charAt(i);

        }

        return reversed;

    }


    public static boolean isPalindrome(String str){

        String reversed ="";

        for (int i = str.length()-1; i >=0 ; i--) {

            reversed+=str.charAt(i);

        }

        return reversed.equals(str);

    }


}
