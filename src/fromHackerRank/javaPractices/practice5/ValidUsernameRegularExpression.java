package fromHackerRank.javaPractices.practice5;

import java.util.ArrayList;
import java.util.Scanner;

public class ValidUsernameRegularExpression {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        Scanner input = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        int x = input.nextInt();

        input.nextLine();

        for (int i = 0; i < x; i++) {

            names.add(input.nextLine());

        }

        input.close();

int num=0;
        for (String each : names) {

            boolean eachStarts = Character.isLetter(each.charAt(0));

            boolean eachLength = each.length()>=8&&each.length()<=30;

            boolean eachContainsSpecial = false;

            for (int i = 0; i < each.length(); i++) {

                if( ( !(Character.isLetterOrDigit(each.charAt(i))) && !(each.charAt(i) == '_') ) ){
                    eachContainsSpecial=true;
                    break;
                }

            }


            if (eachStarts&&eachLength&&(!eachContainsSpecial)){
                System.out.println("ValidHHH"+num+"HHH"+each);
            }else{
                System.out.println("InvalidHHH"+num+"HHH"+each);
            }

            num++;
        }





    }

}

