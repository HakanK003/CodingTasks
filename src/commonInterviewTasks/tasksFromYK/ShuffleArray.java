package commonInterviewTasks.tasksFromYK;

import java.util.Arrays;

public class ShuffleArray {

    public static void main(String[] args) {
        String[] arr = {"song1","song2", "song3", "song4", "song5", "song6"};
        System.out.println("Arrays.toString(shuffle(arr)) = " + Arrays.toString(shuffle(arr)));
    }

    static String[] shuffle(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = (int)(Math.random() * arr.length);
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

}
