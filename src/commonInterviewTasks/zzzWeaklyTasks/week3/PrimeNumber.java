package commonInterviewTasks.zzzWeaklyTasks.week3;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println(isPrimeNumber(5));

        System.out.println(isPrimeNumber(6));

        System.out.println(isPrimeNumber(15));

        System.out.println(isPrimeNumber(19));


    }

    public static boolean isPrimeNumber(int a){

        for (int i = 2; i <a ; i++) {
            if (a%i==0){return false;}
        }

        return true;
    }

}

/*
Write a method that can check if a number is prime or not
 */