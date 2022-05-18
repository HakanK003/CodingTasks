package commonInterviewTasks.java360;

public class FizzBuzz {

    public static void main(String[] args) {

        nThFZ(1);
        nThFZ(3);
        nThFZ(5);
        nThFZ(15);

        System.out.println("---------------------------------------------");

        firstNThFB(30);

    }

    public static void nThFZ(int n){

        if (n%5==0||n%3==0){

            if (n%3==0){
                System.out.print("Fizz");
            }
            if (n%5==0){
                System.out.print("Buzz");
            }

            System.out.println();

        }else {
            System.out.println(n);
        }

    }

    public static void firstNThFB(int n){

        for (int i = 1; i <= n; i++) {


            if (i%5==0 || i%3==0){

                if (i%3==0){
                    System.out.print("Fizz");
                }
                if (i%5==0){
                    System.out.print("Buzz");
                }

                System.out.print(" ");

            }else {
                System.out.print(i+" ");
            }

        }

    }


}
