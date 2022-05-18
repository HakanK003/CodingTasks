package commonInterviewTasks.zzzWeaklyTasks.week10;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSortingInAscending {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>( Arrays.asList(9, 8, 7, 1, 2, 3, 4, 5, 6) );

        System.out.println("sortAscending(numbers) = " + sortAscending(numbers));


    }

    public static ArrayList<Integer> sortAscending(ArrayList<Integer> numbers){

        int temp;

        for (int i = 0; i < numbers.size(); i++) {

            for (int j = 0; j < numbers.size(); j++) {

                if (numbers.get(i)<numbers.get(j)){

                    temp = numbers.get(i);
                    numbers.set(i, numbers.get(j) );
                    numbers.set(j,temp);

                }

            }

        }

        return numbers;
    }

}
