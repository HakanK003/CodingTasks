package programmingLab.part2_variables;

import java.util.Scanner;

public class SchoolGrades {

    public static void main(String[] args) {
        // Enter your code here

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Grader!");

        System.out.println("Please enter subject name number 1 and score for this subject");
        String subjectName1 = input.nextLine();
        double subjectScore1 =input.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        input.nextLine();
        String subjectName2 = input.nextLine();
        double subjectScore2 =input.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");
        input.nextLine();
        String subjectName3 = input.nextLine();
        double subjectScore3 =input.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject");
        input.nextLine();
        String subjectName4 = input.nextLine();
        double subjectScore4 =input.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this subject");
        input.nextLine();
        String subjectName5 = input.nextLine();
        double subjectScore5 =input.nextDouble();

        input.close();

        double averageScore = (subjectScore1+subjectScore2+subjectScore3+subjectScore4+subjectScore5)/5;


        System.out.println("Summary: " + subjectName1 + " - "+ subjectScore1 + ", " +  subjectName2 + " - "+ subjectScore2 + ", " +  subjectName3 + " - "+ subjectScore3 + ", " +  subjectName4 + " - "+ subjectScore4 + ", " +  subjectName5 + " - "+ subjectScore5 + "\nYour average score is: " + averageScore + "\nThank you for using Grader!\nGoodbye!");



    }
}

/*
Write the program that will calculate the average grade.
Use 5 String variables and 6 double variables to hold the subject and the grade value.
Build a summary with all the information by concatenating the subjects and grades.
Then calculate the average grade and print display the average score too.

Execution flow with example:

Welcome to the Grader!
Please enter subject name number 1 and score for this subject
Math
5.0
Please enter subject name number 2 and score for this subject
Biology
4.2
Please enter subject name number 3 and score for this subject
English
4.4
Please enter subject name number 4 and score for this subject
Chemistry
4.8
Please enter subject name number 5 and score for this subject
Music
3.4

Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8, Music - 3.4
Your average score is: 4.36
Thank you for using Grader!
Goodbye!
 */