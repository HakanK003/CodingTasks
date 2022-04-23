package programmingLab.part3_statements;

import java.util.Scanner;

public class AndroidVersions {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double version = input.nextDouble();
        //WRITE YOUR CODE HERE:

        input.close();

        String result =(version==1.0)? ("No codename")
                :(version==1.1)? ("No codename")
                :(version==1.5)? ("Cupcake")
                :(version==1.6)? ("Donut")
                :(version>=2.0&&version<=2.1)? ("Eclair")
                :(version>=2.2&&version<=2.23)? ("Froyo")
                :(version>=2.3&&version<=2.37)? ("Gingerbread")
                :(version>=3.0&&version<=3.26)? ("Honeycomb")
                :(version>=4.0&&version<=4.04)? ("Ice Cream Sandwich")
                :(version>=4.1&&version<4.31)? ("Jelly Bean")
                :(version>=4.4&&version<=4.44)? ("KitKat")
                :(version>=5.0&&version<=5.11)? ("Lollipop")
                :(version>=6.0&&version<=6.01)? ("Marshmallow")
                :(version==7.0)? ("Nougat")
                :(version>=7.1&&version<=7.12)? ("Nougat")
                :(version==8.0)? ("Oreo")
                :(version==8.1)? ("Oreo")
                :(version==9.0)? ("Pie")
                :(version==10.0)? ("Android 10")
                :(version==11)? ("Android 11")
                : ("Sorry, I don't know this version!");


        System.out.println(result);


    }

}

/*
Android is one of the best operating systems in the world that helps the billion of users
who use smartphones and tablets. Also, Android versions always had some funny names related to sweets.
In this assignment, you need to write a program that will print a name of Android version, based on number.
Please refer to the link beneath, in order to develop your if statement. https://www.javatpoint.com/android-versions

Create an object of Scanner class named scanner. (DONE)
Create double variable named version. (DONE)
Write an if statement that will print android version name based on value of the version variable.
Versions 1.5 - Cupcake 1.6 - Donut 2.1 - Eclair 2.2 - Froyo 2.3 - Gingerbread 3.1 - Honeycomb 4.0
- Ice Cream Sandwich 4.1 - Jelly Bean 4.4 - KitKat 5.0 - Lollipop 8.0 - Oreo 9.0 - Pie

Example:
input: 1.5
output: Cupcake
input: 1.5
output: Cupcake
input: 9.0
output: Pie
input: 9.0
output: Pie
input: 11.0
output: Sorry, I don't know this version!
 */