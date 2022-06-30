package commonInterviewTasks.tasksFromYK;

public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
