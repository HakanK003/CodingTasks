package commonInterviewTasks.tasksFromYK;

public class ReverseLettersOnly {

    public static void main(String[] args) {
        String str = "a!!!b.c.d,e'f,ghi";
        System.out.println("Input string : " + str);
        System.out.println("Output string: " + reverse(str));
    }
    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        int head = 0;
        int tail = chars.length - 1;

        while (head < tail) {
            if (!Character.isAlphabetic(chars[head])) {
                head++;
            } else if(!Character.isAlphabetic(chars[tail])) {
                tail--;
            } else {
                char temp = chars[head];
                chars[head] = chars[tail];
                chars[tail] = temp;
                head++;
                tail--;
            }
        }
        return new String(chars);
    }

}
