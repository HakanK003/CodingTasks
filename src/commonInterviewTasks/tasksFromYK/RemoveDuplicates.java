package commonInterviewTasks.tasksFromYK;

public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(remove("google"));
    }

    private static String remove(String str) {
        String removed="";
        for(int i=0; i<str.length(); i++){
            if(!removed.contains(""+str.charAt(i))){
                removed+=str.charAt(i);
            }
        }
        return removed;
    }

}
