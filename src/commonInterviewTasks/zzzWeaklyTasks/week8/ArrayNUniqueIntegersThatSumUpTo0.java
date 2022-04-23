package commonInterviewTasks.zzzWeaklyTasks.week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayNUniqueIntegersThatSumUpTo0 {

    public static void main(String[] args) {


        System.out.println(Arrays.toString(arrayNUniqueIntegersThatSumUpTo0(5)));

    }


    public static int[] arrayNUniqueIntegersThatSumUpTo0(int number){

        int[] nums = new int[number];

        ArrayList<Integer> numbers = new ArrayList<>();

        Random random = new Random();

        int attempt=0;

        int sum=0;


        do{

            numbers.clear();
            sum=0;

            for (int i = 0; i < number; i++) {

                int x;

                do{

                   x=random.nextInt(20)-10;

                }while( numbers.contains(x) );

                numbers.add(x);

            }



            for (Integer each : numbers) {

                sum+=each;

            }


//            System.out.println(attempt+" attempt "+numbers+" sum is-> "+sum);

            attempt++;
        }
        while(sum!=0);


        for (int i = 0; i < nums.length; i++) {

            nums[i]=numbers.get(i);

        }


        return nums;

    }


}

/*
Array - N unique integers that sum up to 0
Write a function:
that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function
can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, -
1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1] (but there are
many more correct answers)
 */