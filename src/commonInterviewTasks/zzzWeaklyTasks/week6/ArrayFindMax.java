package commonInterviewTasks.zzzWeaklyTasks.week6;

public class ArrayFindMax {

    public static void main(String[] args) {

        int[] arr1 = {1, 6, 2, 5, 3, 4};

        System.out.println("findMax(arr1) = " + findMax(arr1));

    }


    public static int findMax(int[] arr){

        int max = arr[0];

        for (int each : arr) {
            if ( each>max ){ max=each; }
        }

        return max;

    }


}

/*
Array -- Find Maximum
Write a method that can find the maximum number from an int Array
 */