package commonInterviewTasks.tasksFromYK;

public class PalindromeString {

    public static void main(String[] args) {
        String pal = "radar";
        System.out.println("isPalindrome(pal) = " + isPalindrome(pal));
    }

    private static boolean isPalindrome(String str) {
        int head = 0, tail = str.length() - 1;
        while (head < tail) {
            if (str.charAt(head) != str.charAt(tail)) {
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }

}
