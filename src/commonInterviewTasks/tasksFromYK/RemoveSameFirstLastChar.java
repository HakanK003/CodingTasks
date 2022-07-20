package commonInterviewTasks.tasksFromYK;

public class RemoveSameFirstLastChar {

    public static void main(String[] args) {
        String str = "XwordX";
        System.out.println(removeFirstLast(str));
    }

    private static String removeFirstLast(String str) {
        if(str.charAt(0)==str.charAt(str.length()-1)){
            str=str.substring(1,str.length()-1);
        }
        return str;
    }

}
