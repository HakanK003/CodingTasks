package programmingLab.part5_loops;

public class PrintEvenFrom80to20 {

    public static void main(String[] args) {

        for(int i= 80; i>=20; i--){
            if(i%2==0){
                System.out.print(i);
                if(i==20){break;}
                System.out.print(" ");}
        }

    }

}

/*
Write a for loop that prints all even integers from 80 through and including 20. Separate each number with a space
 */