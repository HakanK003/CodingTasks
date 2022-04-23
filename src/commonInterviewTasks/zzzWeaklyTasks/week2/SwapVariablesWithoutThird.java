package commonInterviewTasks.zzzWeaklyTasks.week2;

public class SwapVariablesWithoutThird {

    public static void main(String[] args) {

        int a = 1;
        int b = 3;

        a = a - b;

        b = a + b;

        a = b - a;

        System.out.println("a = " + a + "\nb = " + b);


    }

}
