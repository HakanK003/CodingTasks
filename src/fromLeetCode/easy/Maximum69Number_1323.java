package fromLeetCode.easy;

/*
    Related Topics
    -> Math
    -> Greedy
 */


public class Maximum69Number_1323 {


    //Runtime: 6 ms, faster than 27.76% of Java online submissions for Maximum 69 Number.
    //Memory Usage: 41.1 MB, less than 46.74% of Java online submissions for Maximum 69 Number.
    public int maximum69Number2 (int num) {

        String number = ""+num;
        number =  number.replaceFirst("6", "9");
        return Integer.parseInt( number );

    }

    //Runtime: 6 ms, faster than 27.76% of Java online submissions for Maximum 69 Number.
    //Memory Usage: 41.5 MB, less than 17.40% of Java online submissions for Maximum 69 Number.
    public int maximum69Number1 (int num) {

        String number = ""+num;
        return Integer.parseInt( number.replaceFirst("6", "9") );

    }

}


//TODO 0ms example solution
//
//    public int maximum69Number (int num) {
//        var temp = num;
//        int firstDigit = -1;
//        for (int i = 0; temp > 0; i++){
//            if (temp % 10 == 6){
//                firstDigit = i;
//            }
//            temp /= 10;
//        }
//        if (firstDigit == -1){
//            return num;
//        }
//        temp = num / (int)Math.pow(10,firstDigit);
//        return (temp + 3) * (int)Math.pow(10,firstDigit) + num % (int)Math.pow(10, firstDigit);
//    }

//TODO 1ms example solution
//
//    public int maximum69Number (int num) {
//     char [] s=String.valueOf(num).toCharArray();
//     for(int i=0;i<s.length;i++)
//     {
//         if(s[i]=='6')
//         {
//             s[i]='9';
//             break;
//         }
//
//     }
//         int result=Integer.valueOf(String.valueOf(s));
//
//     return result;
//    }

//TODO 38800kb example solution
//
//    public int maximum69Number (int num) {
//        String num2 = String.valueOf(num);
//        int i;
//        for(i = 0; i < num2.length(); i++){
//            if(num2.charAt(i) == '6') break;
//        }
//
//        return i < num2.length() ? num + 3 * (int)Math.pow(10, (num2.length() - i - 1)) : num;
//    }