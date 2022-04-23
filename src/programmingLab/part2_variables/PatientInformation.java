package programmingLab.part2_variables;

import java.util.Scanner;

public class PatientInformation {

    public static void main(String[] args) {
        //Enter your code here:

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the patient portal!\nPlease enter your personal information");

        System.out.println("Enter your first name");
        String firstname = input.nextLine();

        System.out.println("Enter your last name");
        String lastName = input.nextLine();

        System.out.println("Enter your email");
        String email = input.nextLine();

        System.out.println("Enter your street");
        String street = input.nextLine();

        System.out.println("Enter your city");
        String city = input.nextLine();

        System.out.println("Enter your state");
        String state = input.nextLine();

        System.out.println("Enter your zip code");
        int zipCode = input.nextInt();

        System.out.println("Enter your work phone number");
        long workPhone = input.nextLong();

        System.out.println("Enter your personal phone number");
        long personalPhone = input.nextLong();

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter your height");
        double height = input.nextDouble();

        System.out.println("Enter your weight");
        double weight = input.nextDouble();

        System.out.println("Are you married?");
        boolean married = input.nextBoolean();

        input.close();

        System.out.println("Patient personal information\nFull name: " + lastName + ", " +
                firstname + "\nAddress: " + street + ", " + city + ", " + state + " " +
                zipCode + "\nContacts: work phone number - " + workPhone + ", personal phone number - " +
                personalPhone + ", email: "+ email + "\nAge: " + age + "\nHeight: " + height + "\nWeight: " +
                weight + " pounds\nMarried?: " + married);


    }

}

/*
Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.

Declare 2 int variables: age, zipcode Declare 2 double variables: height, weight. Declare boolean variable: isMarried (for marriage status). Declare 2 long variables: workPhoneNumber and personalPhoneNumber.

Create a Scanner object named scan.

Execution flow with example:

Welcome to the patient portal!
Please enter your personal information
Enter your first name
James
Enter your last name
May
Enter your email
jamesmay@gmail.com
Enter your street
7925 Jones Branch Dr
Enter your city
McLean
Enter your state
VA
Enter your zip code
22102
Enter your work phone number
7896542314
Enter your personal phone number
2406542314
Enter your age
35
Enter your height
5.10
Enter your weight
173.2
Are you married?
true
Welcome to the patient portal!
Please enter your personal information
Enter your first name
James
Enter your last name
May
Enter your email
jamesmay@gmail.com
Enter your street
7925 Jones Branch Dr
Enter your city
McLean
Enter your state
VA
Enter your zip code
22102
Enter your work phone number
7896542314
Enter your personal phone number
2406542314
Enter your age
35
Enter your height
5.10
Enter your weight
173.2
Are you married?
true
build contacts variable by concatenating work phone, personal phone and email

build fullName variable by concatenating first name and last name

build address variable by concatenating street, city, state, zip code

Output in the console:

Patient personal information Full name: May, James Address: 7925 Jones Branch Dr, McLean, VA 22102
Contacts: work phone number - 7896542314, personal phone number - 2406542314, email:
jamesmay@gmail.com Age: 35 Height: 5.1 Weight: 173.2 pounds Married?: true
 */