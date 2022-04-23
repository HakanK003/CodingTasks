package commonInterviewTasks.zzzWeaklyTasks.week3;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        System.out.println(returnPositive(-3));

        System.out.println(returnPositive(-9));

        System.out.println(returnPositive(-123));

    }

    public static int returnPositive(int a){
        return (a>=0)? a : -a ;
    }

}

/*
Write a return method that can reverse negative number and return it as int
 */