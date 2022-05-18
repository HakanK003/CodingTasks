package randomTasks;

public class ReverseNumbersR {

    public static void main(String[] args) {

        System.out.println(reverseNum(12345));


    }

    public static int reverseNum(int number){

        if (number>=1)
            return   ( reverseNum(number/10) + ( ( number%10 )*10 ) )*10;
        else
            return number%10;
    }

}
