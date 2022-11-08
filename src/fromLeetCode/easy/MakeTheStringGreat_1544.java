package fromLeetCode.easy;

import java.util.Stack;


/*
    Related Topics
    -> String
    -> Stack
*/

public class MakeTheStringGreat_1544 {

    public String makeGood(String s) {

        Stack<Character> stack = new Stack<>();

        for (char currChar : s.toCharArray()) {

            if (!stack.isEmpty() && Math.abs(stack.lastElement() - currChar) == 32)
                stack.pop();
            else
                stack.add(currChar);
        }

        StringBuilder result = new StringBuilder();

        for (char currChar : stack)
            result.append(currChar);

        return result.toString();
    }


    public String makeGood1(String s) {

        StringBuilder result = new StringBuilder(s);

        while (result.length() > 1) {

            boolean find = false;

            for (int i = 0; i < result.length() - 1; ++i) {

                char currChar = result.charAt(i), nextChar = result.charAt(i + 1);

                if (Math.abs(currChar - nextChar) == 32) {
                    result.deleteCharAt(i);
                    result.deleteCharAt(i);
                    find = true;
                    break;
                }
            }

            if (!find)
                break;
        }

        return result.toString();

    }

}

//TODO 1ms example solution
//
//    public String makeGood(String s) {
//        char[] stack = new char[s.length()];
//        int top = -1;
//        for(int i=0; i<s.length(); i++){
//            if(top>=0 && Math.abs(s.charAt(i)-stack[top])==32){
//                top--;
//            }
//            else{
//                stack[++top] = s.charAt(i);
//            }
//        }
//
//        char[] ans = new char[top+1];
//        while(top!=-1){
//            ans[top] = stack[top];
//            top--;
//        }
//        return new String(ans);
//    }