package commonInterviewTasks.zzzWeaklyTasks.week8;

import java.util.Arrays;

public class ZerosToEnd {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(zerosToEnd(new int[]{0, 1, 0, 20, 3, 0, 1, 8, 0, -5, 0, -9, 9, })));

    }


    public static int[] zerosToEnd(int[] numbers){

        int temp;

        for (int j = 0; j < numbers.length; j++) {


            for (int i = 0; i < numbers.length; i++) {

                if (numbers[i] == 0 && i != numbers.length - 1) {

                    temp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = temp;

                }


            }

        }

        return numbers;
    }



//    public static int[] zerosToEnd(int[] numbers){
//
//        int temp;
//
//        for (int i = 0; i <numbers.length; i++) {
//
//
//            for (int j = 0; j <numbers.length; j++) {
//
//                if (numbers[i]==0){
//
//                    temp=numbers[j];
//                    numbers[j]=numbers[i];
//                    numbers[i]=temp;
//
//                }
//
//            }
//
//
//        }
//
//        return numbers;
//    }

}

/*
Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex:
input: {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
 */