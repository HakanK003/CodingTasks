package commonInterviewTasks.someTasks.array_tasks;

public class Array_FindMinimum {

    public static void main(String[] args) {

        System.out.println(minValue(new int[]{5, 9, 6, 1, 7, 3, 2}));

    }

    public static int minValue(int[] n) {

        int min = Integer.MAX_VALUE;

        for (int each : n) {
            if (each < min) {
                min = each;
            }
        }

        return min;

    }

}

    /*
    Write a function that can find the maximum number from an int Array
     */
