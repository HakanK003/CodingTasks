package fromLeetCode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/*
    Related Topics
    -> Stack
    -> String
 */

public class ValidParentheses_20 {

    //Runtime: 6 ms, faster than 14.34% of Java online submissions for Valid Parentheses.
    //Memory Usage: 41.3 MB, less than 83.59% of Java online submissions for Valid Parentheses.
    public boolean isValid(String s) {

        Stack<Character> balance = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i)=='('){
                balance.add('(');
            }
            if (s.charAt(i)==')'){
                if (balance.size()!=0&&balance.peek()=='('){
                    balance.pop();
                }else {
                    return false;
                }
            }

            if (s.charAt(i)=='['){
                balance.add('[');
            }
            if (s.charAt(i)==']'){
                if (balance.size()!=0&&balance.peek()=='['){
                    balance.pop();
                }else {
                    return false;
                }
            }

            if (s.charAt(i)=='{'){
                balance.add('{');
            }
            if (s.charAt(i)=='}'){
                if (balance.size()!=0&&balance.peek()=='{'){
                    balance.pop();
                }else {
                    return false;
                }
            }
        }

        return balance.size()==0;

    }

}
