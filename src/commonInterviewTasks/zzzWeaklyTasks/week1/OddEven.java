package commonInterviewTasks.zzzWeaklyTasks.week1;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = input.nextInt();

        System.out.println( (x%2==0)? "Number is Even" : "Number is Odd" );


    }

}
