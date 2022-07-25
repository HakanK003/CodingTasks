package commonInterviewTasks.tasksFromYK;

public class PalindromeInteger {

    public static void main(String[] args) {
        // https://leetcode.com/problems/palindrome-number/
        System.out.println("palindrome = " + isPalindrome(121));
    }

    public static boolean isPalindrome(int num){
        if (num<0) {
            return false;
        }
        int temp=num;
        int reverse=0;

        while (temp>0){
            reverse*=10;
            reverse+=temp%10;
            temp/=10;
        }
        return reverse == num;
    }

}
