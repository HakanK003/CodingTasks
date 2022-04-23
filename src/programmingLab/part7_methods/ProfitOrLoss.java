package programmingLab.part7_methods;

import java.util.Scanner;

public class ProfitOrLoss {

    public static String profits(int buyPrice,int sellPrice){
        //your code here
        return (buyPrice>sellPrice)? "loss" :(buyPrice<sellPrice)? "profit" : "no loss";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profits(in.nextInt(), in.nextInt()));
        in.close();
    }

}

/*
Finish the profits method which accepts the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.

It returns a string value that can be "profit","loss","no loss"

Example

profits(100,1500)
returns: "profit"

profits(20,5)
returns: "loss"

profits(100,100)
returns: "no loss"
 */