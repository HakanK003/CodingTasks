package randomTasks;

public class ReverseNumberRecursion {

        public static void main(String[] args) {

            int num = 1234, reversed = 0;

            System.out.println(reverseNum(num, reversed));

        }


        public static int reverseNum(int num, int reversed){


            if(num == 0){
                return reversed;
            }else{

                reversed = num % 10 + reversed*10 ;
                return reverseNum(num/10, reversed);

            }


        }


//    public static int reverseNum2 (int num, int reversed) {
//
//        int num = 1234, reversed = 0;
//
//        System.out.println("Original Number: " + num);
//
//        // run loop until num becomes 0
//        while(num != 0) {
//
//            // get last digit from num
//            int digit = num % 10;
//            reversed = reversed * 10 + digit;
//
//            // remove the last digit from num
//            num /= 10;
//        }
//
//        System.out.println("Reversed Number: " + reversed);
//    }


}
