package fromHackerRank.javaPractices.practice6;

import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        try{

            Scanner input = new Scanner(System.in);

            int x = input.nextInt();
            int y = input.nextInt();

            System.out.println(x/y);

        }catch (Exception e){

            if (e.toString().contains("InputMismatchException")&&e.toString().contains(":"))

            System.out.println(e.toString().substring(0,e.toString().indexOf(":")));

            else

            System.out.println(e);

        }

    }

}
