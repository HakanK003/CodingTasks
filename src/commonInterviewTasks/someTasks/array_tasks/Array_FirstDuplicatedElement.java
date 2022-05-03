package commonInterviewTasks.someTasks.array_tasks;

public class Array_FirstDuplicatedElement {


    /*
    write a program that can find the first duplicated element from the array
     */


    public static void main(String[] args) {

        System.out.println(firstDuplicatedOrZero(new int[]{0, 1, 2, 3, 1, 5, 4, 4}));


    }

    public static int firstDuplicatedOrZero (int[] numbers){

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i+1; j < numbers.length; j++) {

                if (numbers[i]==numbers[j]) {
                    return numbers[i];
                }

            }

        }

        return 0;
    }


    //    public static int firstDuplicatedElement(int[] array) {
    //        int firstDuplicated = 0;
    //
    //        for (int each : array) {
    //            int frequency = 0;
    //            for (int each2 : array) {
    //                if (each == each2)
    //                    frequency++;
    //            }
    //
    //            if (frequency > 1) {
    //                firstDuplicated = each;
    //                break;
    //            }
    //
    //        }
    //
    //        return firstDuplicated;
    //
    //    }


}
