package commonInterviewTasks.someTasks.array_tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Array_AddUpToSum {


    public static void main(String[] args) {

        int[] arr = {8, 7, 2, 5, 3, 1};
        int sum = 10;


        Map<Integer, Integer> pairs = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if(arr[i] + arr[j] == sum){

                    pairs.put(arr[i], arr[j]);

                }

            }

        }

        System.out.println(pairs);


    }





//    public static ArrayList<int[]> sumPairs(int[] arr, int number){
//
//        ArrayList<int[]> validPairs = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr.length; j++) {
//
//                if (arr[i]+arr[j]==number&&i!=j){
//                    validPairs.add(new int[]{ arr[i], arr[j]});
//                }
//
//            }
//
//        }
//
//        return validPairs;
//
//    }

}

   /*
     given an int[] 'arr' and another int 'sum',
     Write a function which can find a pair of ints in 'arr' that add up to 'sum'.
        Example:
            arr = [8, 7, 2, 5, 3, 1]
            sum = 10
            Output:
                {8=2, 7=3}
     */