package commonInterviewTasks.someTasks.array_tasks;

public class Array_FindMaximum {


    public static void main(String[] args) {

        System.out.println(maxValue(new int[]{1, 9, 5, 6, 7, 3}));


    }


    public static int maxValue(int[] n) {

        int max = Integer.MIN_VALUE;

        for (int each : n) {

            if (each > max) {max = each;}
        }

        return max;
    }


}

    /*
        Write a function that can find the maximum number from an int Array
     */