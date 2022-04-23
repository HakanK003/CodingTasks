package programmingLab.part7_methods;

import java.util.Scanner;

public class ReturnHamletLogic {

    public static boolean hamletQuote(boolean toBe,boolean notToBe){
        // your code here
        boolean a=true;
        if(toBe==false&&notToBe==false){a=false;}

        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(hamletQuote(in.nextBoolean(), in.nextBoolean()));
        in.close();
    }

}

/*
The famous quote is "to be or not to be" is a classic example of boolean logic.

the hamletQuote method only returns true if one or both of the boolean parameters is true.

Examples:

hamletQuote(true, false)
returns true

hamletQuote(false,true)
returns true

hamletQuote(true,true)
returns true

hamletQuote(false,false)
returns false

hint: use the truth table for this one, this can be done with one if and a logical operator.
 */