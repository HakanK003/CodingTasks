package commonInterviewTasks.zzzWeaklyTasks.week1;

import java.util.Scanner;

public class FinRa {

    public static void main(String[] a) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        for (int i = 1; i<=x; i++){

            if(i%3==0||i%5==0) {

                if (i % 3 == 0) {
                    System.out.print("FIN");
                }
                if (i % 5 == 0) {
                    System.out.print("RA");
                }
            }else{
                System.out.print(i);
            }

            System.out.print(" ");
        }

    }

}
