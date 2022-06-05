package randomTasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WhiteBoardPreparation {

    public static void main(String[] args) {

        // TODO --> 1 Frequencies to Map

        frequencyMap2("Hello There!");



        // TODO --> 2 Sort Array Ascending

        System.out.println(Arrays.toString(sortArray(new int[]{1, 9, 5, 7, 6, 2, 3, 4, 8, 7})));


        // TODO --> 3 Fibonacci (Given Step Start from 0 => 0->0, 1->1, 2->1, 3->2, 4->3, 5->5 …)

        System.out.println(fibonacciStep(5));

        // TODO --> 4 Which Step of Fibonacci (Given Value Start from 2 => 2->3, 3->4, 5->5 …)

        System.out.println(fibocciReverse(21));

    }



    // TODO 1


    public static void frequencyMap2(String str){

        Map<String, Integer> frequencies = new HashMap();

        for(int i =0; i<str.length(); i++){

            if(!frequencies.containsKey(str.charAt(i)+"")){

                int count =0;

                for(int j=i; j<str.length(); j++){

                    if(str.charAt(i)==str.charAt(j)){
                        count++;
                    }

                }

                frequencies.put(str.charAt(i)+"", count);

            }

        }

        System.out.println(frequencies);

    }

    // TODO 2


    public static int[] sortArray(int[] numbers){

        for(int i = 0; i<numbers.length; i++){

            for(int j=i; j<numbers.length; j++){

                if(numbers[i]>numbers[j]){

                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;

                }

            }

        }

        return numbers;

    }

    // TODO 3

    public static int fibonacciStep(int step){

        int step1 = 0;
        int step2= 1;

        if(step==0){
            return step1;
        }else if (step==1){
            return step2;
        }

        int temp=0;

        for(int i =0; i<step-1; i++){

            temp  = step2;
            step2 += step1;
            step1 = temp;

        }
        return  step2;
    }


    // TODO 4

    public static int fibocciReverse(int number){

        int step = 2;
        int fibo1 = 1;
        int fibo2 = 1;
        int temp =0;

        while(fibo2!=number){

            temp = fibo2;
            fibo2 += fibo1;
            fibo1 = temp;

            step++;

        }

        return step;

    }


}


