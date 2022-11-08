package fromLeetCode.problems_Java.easy;

/*
    Related Topics
    -> String
    -> Math
    -> Bit Manipulation
    -> Simulation
*/

public class AddBinary_67 {


    public String addBinary2(String a, String b) {

        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }

        if(carry != 0) res.append(carry);

        return res.reverse().toString();
    }

}


//    public String addBinary1(String a, String b) {
//
//        StringBuilder result = new StringBuilder();
//
//        boolean carry = false;
//
//        for (int i = 1; i < Math.max(a.length(), b.length()) ; i++) {
//
//            if (a.length() > i && b.length() > i) {
//
//                int sum = a.charAt(a.length()-i) + b.charAt(b.length()-i) + ((carry) ? 1 : 0) - 96;
//                if (sum == 3) {
//                    result.append("1");
//                    carry = true;
//                } else if (sum == 2) {
//                    result.append("0");
//                    carry = true;
//                } else {
//                    result.append("" + sum);
//                    carry = false;
//                }
//
//            }else if(a.length() > i){
//
//                int sum = a.charAt(a.length()-i) + ((carry) ? 1 : 0) - 48;
//                if (sum == 2) {
//                    result.append("0");
//                    carry = true;
//                } else {
//                    result.append("" + sum);
//                    carry = false;
//                }
//
//            }else if( b.length() > i){
//
//                int sum = b.charAt(b.length()-i) + ((carry) ? 1 : 0) - 48;
//                if (sum == 2) {
//                    result.append("0");
//                    carry = true;
//                } else {
//                    result.append("" + sum);
//                    carry = false;
//                }
//
//            }
//
//
//        }
//
//        result.reverse();
//
//        return  result.toString();
//    }
//}



//            if (digits[i] < 9){
//                digits[i]++;
//                return digits;
//            }
//
//            digits[i]= 0;
//        }
//
//        int[] result= new int[digits.length+1];
//        result[0]=1;
//
//        return result;