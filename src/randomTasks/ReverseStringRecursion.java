package randomTasks;

public class ReverseStringRecursion {

    public static void main(String[] args) {

        System.out.println(reverse("Hello There!"));

    }

    public static String reverse(String str){

        if (str.length()>0) {

            return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));

        }
        else{

            return str;

        }

    }

}
