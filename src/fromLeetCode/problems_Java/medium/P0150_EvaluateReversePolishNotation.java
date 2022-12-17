package fromLeetCode.problems_Java.medium;

import java.util.Stack;

/*
    Related Topics
    -> Math
    -> Array
    -> Stack

    Problem
    -> https://leetcode.com/problems/evaluate-reverse-polish-notation/

        Evaluate the value of an arithmetic expression in Reverse Polish Notation.
        Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
        Note that division between two integers should truncate toward zero.
        It is guaranteed that the given RPN expression is always valid.
        That means the expression would always evaluate to a result, and there will not be any division by zero operation.


    Examples
    -> Example 1
            Input: tokens = ["2","1","+","3","*"]
            Output: 9
            Explanation: ((2 + 1) * 3) = 9
    -> Example 2
            Input: tokens = ["4","13","5","/","+"]
            Output: 6
            Explanation: (4 + (13 / 5)) = 6
    -> Example 3
            Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
            Output: 22
            Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
                = ((10 * (6 / (12 * -11))) + 17) + 5
                = ((10 * (6 / -132)) + 17) + 5
                = ((10 * 0) + 17) + 5
                = (0 + 17) + 5
                = 17 + 5
                = 22

    Constraints
    -> 1 <= tokens.length <= 10^4
    -> tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].
 */


/**
 * Approach 1 ->
 *
 *
 * Time Complexity ->
 *
 * Space Complexity ->
 *
 * Result
 *   Runtime 5 ms Beats 96.88% | Memory 42.1 MB Beats 88.18%
 *
 * Reference
 *   https://leetcode.com/problems/evaluate-reverse-polish-notation/solutions/47446/accepted-clean-java-solution/
 */
class Solution0150_1 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;

                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;

                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;

                case "/":
                    int n1 = stack.pop(), n2 = stack.pop();
                    stack.push(n2 / n1);
                    break;

                default:
                    stack.push(Integer.parseInt(tokens[i]));
            }
        }

        return stack.pop();
    }
}