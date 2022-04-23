package programmingLab.part5_loops;

import java.util.Scanner;

public class Party {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // your code
        // ----------Scanner--------------------------

        String guests="";
        boolean a=true;

        do{
            System.out.println("Please enter guest name");
            guests+=input.nextLine();
            System.out.println("Do you want to enter new guest name:");
            String answer=input.nextLine();
            if(answer.equalsIgnoreCase("yes")){a= true; guests+=", ";}
            if(answer.equalsIgnoreCase("no")){a= false; input.close(); System.out.println(guests);}
        }while(a);


    }

}

/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)

Ask for the first guest name.

Then ask does user want to enter one more guests.

If yes - take the next guest input

If not - finish the program and print list of the guests.

Example:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no
Guest's list: Nick, Linda
 */