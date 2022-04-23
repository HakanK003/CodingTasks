package commonInterviewTasks.zzzWeaklyTasks.week1;

import java.util.Scanner;

public class DivisionWithoutOperator {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        int x = input.nextInt();

        System.out.println("Enter number");
        int y = input.nextInt();

        input.close();


        int result=0;

        while(x>y){

            x=x-y;
            result++;

        }


        int remainder=x;

        System.out.println("Result = "+ result +"\nRemainder = "+remainder);

    }

}
