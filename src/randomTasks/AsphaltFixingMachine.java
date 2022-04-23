package randomTasks;

public class AsphaltFixingMachine {

    public static void main(String[] args) {
        String str=".X..X";
        //X.XXXXX.X.
        //..X....XXX

        int result = solution(str);
        System.out.println(result);
        System.out.println(str);
    }
    public static int solution(String S){

        int patches=0; // To count patches
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i)=='X'){
                i+=2;
                patches++;
            }
        }
        return patches;
    }

}
