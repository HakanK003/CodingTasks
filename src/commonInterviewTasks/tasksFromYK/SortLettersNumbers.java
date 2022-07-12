package commonInterviewTasks.tasksFromYK;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortLettersNumbers {

    public static void main(String[] args) {
        sort("DC501GCCCA098911GADSF98765");
    }

    private static void sort(String str) {
        String[] letters = str.split("[0-9]");
        String[] numbers = str.split("[A-Z]");
        for (int i=0; i<letters.length; i++) {
            letters[i]= Arrays.stream(letters[i].split("")).sorted().collect(Collectors.joining());
        }
        for (int i=0; i<numbers.length; i++) {
            numbers[i]=Arrays.stream(numbers[i].split("")).sorted().collect(Collectors.joining());
        }
        String result="";
        for(int i=0; i<letters.length; i++){
            result+=letters[i].toString()+numbers[i].toString();
        }
        result+=numbers[numbers.length-1];
        System.out.println(result);

    }

}
