package commonInterviewTasks.zzzWeaklyTasks.week9;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveSomeValues {

    public static void main(String[] args) {

        System.out.println(removeValues(new ArrayList<Integer>(Arrays.asList(1, 200, 3, -40, 50, -6, 700, 80, 99))));

    }

    public static ArrayList<Integer> removeValues(ArrayList<Integer> numList){

        numList.removeIf(x->x>100);

        return numList;

    }

}

/*
ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */