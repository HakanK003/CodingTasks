package commonInterviewTasks.java360;

public class ReverseInteger {

    public static void main(String[] args) {


    }

    public static int reverseInteger(int n){

        String number = String.valueOf(n);
         String reversed = "";

        for (int i = number.length()-1; i >=0 ; i--) {

            reversed+=number.charAt(i);

        }

        return Integer.parseInt(reversed);

    }

}
