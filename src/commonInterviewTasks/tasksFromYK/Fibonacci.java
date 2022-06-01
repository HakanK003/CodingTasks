package commonInterviewTasks.tasksFromYK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    static int n1=1, n2=2, n3=0;
    static List<Integer> fiboList = new ArrayList<>(Arrays.asList(n1,n2));

    public static List<Integer> fibonacci(int count){
        if (count > 2) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            fiboList.add(n3);
            fibonacci(--count);
        }
        return fiboList;
    }

}
