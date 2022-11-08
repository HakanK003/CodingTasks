package fromLeetCode.problems_Java.easy;

import java.util.Stack;

/*
    Related Topics
    -> Stack
    -> String
 */

public class ValidParentheses_20 {


    //Runtime: 4 ms, faster than 53.67% of Java online submissions for Valid Parentheses.
    //Memory Usage: 42.7 MB, less than 5.18% of Java online submissions for Valid Parentheses.
    public boolean isValid3(String s) {

        Stack<Character> balance = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                balance.add(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (balance.size() != 0 && balance.peek() == '(') {
                    balance.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                if (balance.size() != 0 && balance.peek() == '[') {
                    balance.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                if (balance.size() != 0 && balance.peek() == '{') {
                    balance.pop();
                } else {
                    return false;
                }
            }

        }


        return balance.size() == 0;

    }



    //Runtime: 2 ms, faster than 91.03% of Java online submissions for Valid Parentheses.
    //Memory Usage: 40 MB, less than 98.58% of Java online submissions for Valid Parentheses.
    public boolean isValid2(String s) {

        Stack<Character> balance = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                balance.add('(');
            } else if (s.charAt(i) == ')') {
                if (balance.size() != 0 && balance.peek() == '(') {
                    balance.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == '[') {
                balance.add('[');
            }
            if (s.charAt(i) == ']') {
                if (balance.size() != 0 && balance.peek() == '[') {
                    balance.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == '{') {
                balance.add('{');
            } else if (s.charAt(i) == '}') {
                if (balance.size() != 0 && balance.peek() == '{') {
                    balance.pop();
                } else {
                    return false;
                }
            }

        }


        return balance.size() == 0;

    }


    //Runtime: 6 ms, faster than 14.34% of Java online submissions for Valid Parentheses.
    //Memory Usage: 41.3 MB, less than 83.59% of Java online submissions for Valid Parentheses.
    public boolean isValid1(String s) {

        Stack<Character> balance = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                balance.add('(');
            }
            if (s.charAt(i) == ')') {
                if (balance.size() != 0 && balance.peek() == '(') {
                    balance.pop();
                } else {
                    return false;
                }
            }

            if (s.charAt(i) == '[') {
                balance.add('[');
            }
            if (s.charAt(i) == ']') {
                if (balance.size() != 0 && balance.peek() == '[') {
                    balance.pop();
                } else {
                    return false;
                }
            }

            if (s.charAt(i) == '{') {
                balance.add('{');
            }
            if (s.charAt(i) == '}') {
                if (balance.size() != 0 && balance.peek() == '{') {
                    balance.pop();
                } else {
                    return false;
                }
            }
        }

        return balance.size() == 0;

    }

}

//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        for (char c : s.toCharArray()) {
//            switch (c) {
//                case '(':
//                    stack.push(')');
//                    break;
//                case '{':
//                    stack.push('}');
//                    break;
//                case '[':
//                    stack.push(']');
//                    break;
//                default:
//                    if (stack.isEmpty() || stack.pop() != c) {
//                        return false;
//                    }
//                    break;
//            }
//        }
//        return stack.isEmpty();
//    }