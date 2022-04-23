package programmingLab.part6_arrays;

import java.util.Scanner;

public class AverageTemperature {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        // Do not touch above. Use array temps
        scan.close();

        double sum=0;

        for(double each : temps){
            sum+=each;
        }

        double average = sum/temps.length;

        System.out.println(average);



    }

}

/*
Given an array temps with temperature values find and print the average value

Example:

input: 80 88 88 84 82 78 60 68
output: 78.5
 */