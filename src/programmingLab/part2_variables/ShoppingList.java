package programmingLab.part2_variables;

import java.util.Scanner;

public class ShoppingList {


    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Item1 and its price:");
        String itemName1 = input.nextLine();
        double itemPrice1 = input.nextDouble();

        System.out.println("Enter Item2 and its price:");
        input.nextLine();
        String itemName2 = input.nextLine();
        double itemPrice2 = input.nextDouble();

        System.out.println("Enter Item3 and its price:");
        input.nextLine();
        String itemName3 = input.nextLine();
        double itemPrice3 = input.nextDouble();

        input.close();

        double report = itemPrice1 + itemPrice2 + itemPrice3;

        System.out.println("Item1: " + itemName1 + " Price: " + itemPrice1 + ", Item2: " + itemName2 + " Price: " + itemPrice2 + ", Item3: " + itemName3 + " Price: " + itemPrice3 + "\nTotal price: " + report);


    }

}

/*
In this assignment you will write a program to create a shopping list and prices.
You will use Scanner object and ask user to enter 3 items followed by its price
and you will calculate total price and show as a report.
-Declare 4 String variables item1, item2, item3, report.
-Declare double variables price1, price2, price3, totalPrice
-Create a Scanner object named scan.

Example:
Enter Item1 and its price:
Tomatoes
5.5
"Enter Item2 and its price:
Cheese
3.5
Enter Item3 and its price:
Apples
6.3

Output:
Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
Total price: 15.3
 */