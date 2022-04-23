package commonInterviewTasks.zzzWeaklyTasks.week9;

import java.util.Arrays;

public class ConcatTwoArrays {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(concatArrays(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7})));

    }

    public static int[] concatArrays(int[] a, int[] b){

        int[] ab = new int[a.length+b.length];

        int x =0;

        for (int eachA : a) {

            ab[x]=eachA;
            x++;

        }

        for (int eachB : b) {

            ab[x]=eachB;
            x++;

        }

        return ab;
    }

}

/*
Array - Concat two arrays
Write a return method that can concate two arrays
 */