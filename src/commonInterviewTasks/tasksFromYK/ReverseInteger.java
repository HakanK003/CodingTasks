package commonInterviewTasks.tasksFromYK;

public class ReverseInteger {

    public static void main(String[] args) {
        int num = -1905;
        System.out.println("reverse(num) = " + reverse(num));
    }

    static int reverse(int num) {
        int reversed = 0;
        while (Math.abs(num)>0) {
            reversed *= 10;
            reversed += num%10;
            num /= 10;
        }
        reversed = num<0 ? -reversed : reversed;
        return reversed;
    }

}
