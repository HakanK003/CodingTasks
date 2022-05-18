package commonInterviewTasks.java360;

public class Fibonacci {

    public static void main(String[] args) {


        nThFibo(5);

        firstNFibo(5);

    }

    public static void nThFibo(int n){

        int n1=0, n2=1, n3;

        if (n==0){
            System.out.println(n1);
        }else if (n==1){
            System.out.println(n2);
        }else {

            for (int i = 2; i <=n; i++) {

                n3=n1+n2;
                n1=n2;
                n2=n3;

            }

            System.out.println(n2);

        }

    }

    public  static void firstNFibo(int n){

        int n1=0, n2=1, n3;

        if (n>=0){
            System.out.print(n1);
        }
        if (n>=1) {
            System.out.print(" " + n2);
        }

        if (n>=2) {

            for (int i = 2; i <= n; i++) {

                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;

                System.out.print(" "+n2);

            }


        }

    }

}
