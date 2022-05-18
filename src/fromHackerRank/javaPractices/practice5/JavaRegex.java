package fromHackerRank.javaPractices.practice5;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaRegex {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner input = new Scanner(System.in);

        ArrayList<String> ipS = new ArrayList<>();

        int a =0;

        while(a<6) {

            ipS.add(input.next());
a++;
        }

        for (String str : ipS) {



            String[] strS = str.split("\\.");

            boolean rule1 = true;

            boolean rule2 = true;

            boolean rule3 = true;

            for (String each : strS) {

                if (!(each.length()<4&&each.length()>0)){
                    rule1=false;
                    break;
                }



                for (int i = 0; i < each.length(); i++) {

                    if (!Character.isDigit(each.charAt(i))){
                        rule2=false;
                        break;
                    }

                }


                if (!(Integer.parseInt(each)>=0&&Integer.parseInt(each)<=255)){

                    rule3=false;
                    break;

                }


            }


            if ((strS.length==4&&(rule1)&&(rule2)&&(rule3))){

                System.out.println("true");

            }else{
                System.out.println("false");
            }



        }



    }

}
