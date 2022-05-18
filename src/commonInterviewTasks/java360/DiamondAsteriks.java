package commonInterviewTasks.java360;

public class DiamondAsteriks {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j >= i; j--) {

                System.out.print(" ");

            }
            for (int k = 0; k<i+i-1; k++) {

                System.out.print("*");

            }


            System.out.println();

        }

        for (int i = 1; i <= 5; i++) {

            for (int k = 0; k<i+i-1; k++) {

                System.out.print(" ");

            }

            for (int j = 5; j >= i; j--) {

                System.out.print("*");

            }


            System.out.println();

        }

//
//        for (int i = 0; i < 5; i++) {
//
//            for (int j = 1; j <=i; j++) {
//                System.out.print(" ");
//            }
//
//            System.out.print("*");
//
//        }
//        System.out.println();
//
//    }

    }
}