package programmingLab.part9_oop;

import java.util.Scanner;

public class Atts {

    public String name,color;
    public int amount;

    public String asString(){
        return "name: "+name+" color: "+color+" amount: "+amount;
    }

}


class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Atts a = new Atts();
        a.name = in.next();
        a.color = in.next();
        a.amount = in.nextInt();

        System.out.println(a.asString());
    }
}

/*
You have two classes Main and Atts. Do not touch the Main class. Finish the Atts class to have attributes:

Strings: name, color
int: amount
Method: asString() (returns String in format shown below)
All attributes should be public

Example:

   Atts a = new Atts();
   a.name = "table";
   a.color = "brown";
   a.amount = 1;
   System.out.println(a.asString());
   Output

name: table color: brown amount: 1
 */