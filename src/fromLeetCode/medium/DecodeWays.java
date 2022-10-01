package fromLeetCode.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class DecodeWays {


    public int numDecodings(String s) {
        if (s==null||s.length()==0){
            return 0;
        }

        // declare ways array with two extra space, because ways[i] also affect by ways[i+2]
        int[] ways=new int[s.length()+2];


        Arrays.fill(ways, 1);
        int i=s.length()-1;

        ways[i]=s.charAt(i)=='0'?0:1;

        for (i=i-1; i>=0; i--){
            if (s.charAt(i)=='0'){
                // if current digit is '0', so no mater what right is, current ways should be 0;
                ways[i]=0;
            }
            else{
                // if current digit is not '0', current ways should be ways[i+1]
                // because, for example s="12", i=0, ways[1]=1, then because current digit is not zero, so for
                // each situation of when i=1, the current i=0 should  be a valid way,
                ways[i]=ways[i+1];


                // check is current digit with right 1 digit can be a valid situation,so in this situation only s.charAt(i)=='1'||
                // s.charAt(i)=='2' and s.charAt(i+1)<='6' can be valid situation, the ways[i] should + ways[i+2];

                if (i+2<ways.length && s.charAt(i)=='1'||s.charAt(i)=='2' &&s.charAt(i+1)<='6'){
                    ways[i]+=ways[i+2];
                }
            }
        }

        return ways[0];
    }


    public int numDecodings2(String s) {

        int count =1;
        int container =1;
        int fluidWays =1;

        for (int i = s.length()-1; i >=0; i--) {

            if (s.charAt(i)=='0') {
                container-=fluidWays;
                container+=(fluidWays*(fluidWays-1))/2;
                fluidWays=0;
                count*=container;
                container =1;
                continue;
            }

            if ( !(i+2 <= s.length()-1 && (s.charAt(i+2)=='0')) )
                if ( i+1 <= s.length()-1 && s.charAt(i)<'3'&&s.charAt(i+1)<'7' ) {
                    container+=1;
                    if (s.charAt(i)<'3'){
                        fluidWays+=1;
                    }else{
                        fluidWays=1;
                        count*=container;
                        container =1;
                    }
                    container-=fluidWays;
                    container+=(fluidWays*(fluidWays-1))/2;
                }

        }

        if (fluidWays>0){
            container-=fluidWays;
            container+=(fluidWays*(fluidWays-1))/2;
            count*=container;
        }


        return count;

    }

//    public int findWay(String str, int currentCount){
//
//        ArrayList<String> results = new ArrayList<>();
//
//        String currentResult = "";
//
//        for (int i = str.length()-1; i >= 0 ; i--) {
//
//            if (str.charAt(i)=='0'){
//                currentResult += decode(""+str.charAt(i)+str.charAt(i-1));
//            }
//
//        }
//
//    }

//    private String decode(String s) {
//
//        switch (s){
//
//            case "1":
//                return "A";
//            case "2":
//                return "B";
//            case "3":
//                return "C";
//            case "4":
//                return "D";
//            case "5":
//                return "E";
//            case "6":
//                return "F";
//            case "7":
//                return "G";
//            case "8":
//                return "H";
//            case "9":
//                return "I";
//            case "10":
//                return "J";
//            case "11":
//                return "K";
//            case "12":
//                return "L";
//            case "13":
//                return "M";
//            case "14":
//                return "N";
//            case "15":
//                return "O";
//            case "16":
//                return "P";
//            case "17":
//                return "R";
//            case "18":
//                return "S";
//            case "19":
//                return "T";
//            case "20":
//                return "U";
//            case "21":
//                return "V";
//            case "22":
//                return "Y";
//            case "23":
//                return "X";
//            case "24":
//                return "X";
//            case "25":
//                return "W";
//            case "26":
//                return "Z";
//        }
//
//    }

}
