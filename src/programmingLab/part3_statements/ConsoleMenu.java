package programmingLab.part3_statements;

import java.util.Scanner;

public class ConsoleMenu {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("---------------");
        System.out.println("select an option:");
        System.out.println("1) option 1");
        System.out.println("2) option 2");
        System.out.println("3) option 3");
        System.out.println("---------------");

        int choice = s.nextInt();

        //Write your code here:
        s.close();

        if(choice==1){System.out.println("user selected 1");}
        if(choice==2){System.out.println("user selected 2");}
        if(choice==3){System.out.println("user selected 3");}


    }

}

/*
A console menu is basically a text menu. After it is outputted to the console a user input is captured.
Then the program decides what to do according to the user input (what the user selected).

This is done using separate if statements(without else) or branched if statements.

Uur console menu has 3 items called "options"

Flow:

Prints:
---------------
select an option:
1) option 1
2) option 2
3) option 3
---------------
Prints:
---------------
select an option:
1) option 1
2) option 2
3) option 3
---------------
if choice is 1
print:
user selected 1

if choice is 2
print:
user selected 2

if choice is 3
print:
user selected 3
 */