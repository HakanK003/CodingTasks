package programmingLab.part3_statements;

import java.util.Scanner;

public class GiftCard {

    public static void main(String[] args) {
        //WRITE YOUR CODE HERE

        Scanner input = new Scanner(System.in);

        String item = input.nextLine();

        input.close();

        //you have always 100$

        String result =
                (item.equals("Hat"))?"Thank you for your purchase! \nYour current balance is: " + (100-25) + "$"
                        :(item.equals("Blanket"))?"Thank you for your purchase! \nYour current balance is: " + (100-60) + "$"
                        :(item.equals("Charger"))?"Thank you for your purchase!\nYour current balance is: " + (100-15) + "$"
                        :(item.equals("Headphones"))?"Thank you for your purchase! \nYour current balance is: " + (100-30) + "$"
                        :(item.equals("Laptop"))?"Sorry, not enough funds on your gift card!"
                        :(item.equals("Pants"))?"Thank you for your purchase! \nYour current balance is: " + (100-50) + "$"
                        :(item.equals("Pillow"))?"Thank you for your purchase! \nYour current balance is: " + (100-40) + "$"
                        :(item.equals("Smartphone"))?"Sorry, not enough funds on your gift card!"
                        :(item.equals("Socks"))?"Thank you for your purchase!\nYour current balance is: " + (100-5) + "$"
                        :(item.equals("USB cable"))?"Thank you for your purchase!\nYour current balance is: " + (100-10) + "$"
                        :"Invalid item!";

        System.out.println(result);


    }

}

/*
Similar to Vending Machine
Let's say I've got a 100$ gift card and you want to buy something in your online store.
Write a program that will help me to buy something and display leftover balance after purchase.

If item is not in the list, display message: "Invalid item!".
If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
List of items Blanket - 60$ Charger - 15$ Hat - 25$ Headphones - 30$ Laptop - 200$ Pants - 50$ Pillow - 40$
Smartphone - 1000$ Socks - 5$ USB cable - 10$

Hint: if/ else if / else or switch statement

Examples:

input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$
input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$
input: Laptop
Output:
Sorry, not enough funds on your gift card!
input: Cupcake
output: Invalid item!
 */