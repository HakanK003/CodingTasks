package fromLeetCode.problems_Java.hard;

/*
    Related Topics
    -> Math
    -> Stack
    -> String
    -> Recursion

    Problem
    -> https://leetcode.com/problems/basic-calculator/

        Given a string s representing a valid expression, implement a basic calculator to evaluate it,
        and return the result of the evaluation.
        Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().

    Examples
    -> Example 1
            Input: s = "1 + 1"
            Output: 2
    -> Example 2
            Input: s = " 2-1 + 2 "
            Output: 3
    -> Example 3
            Input: s = "(1+(4+5+2)-3)+(6+8)"
            Output: 23

    Constraints
    -> 1 <= s.length <= 3 * 10^5
    -> s consists of digits, '+', '-', '(', ')', and ' '
    -> s represents a valid expression
    -> '+' is not used as a unary operation (i.e., "+1" and "+(2 + 3)" is invalid)
    -> '-' could be used as a unary operation (i.e., "-1" and "-(2 + 3)" is valid)
    -> There will be no two consecutive operators in the input
    -> Every number and running calculation will fit in a signed 32-bit integer
 */



/**
 * Approach 1 ->
 *
 *   Check reference
 *
 * Time Complexity ->
 *
 * Space Complexity ->
 *
 * Result
 *   Runtime: 3 ms, faster than 99.28% of Java online submissions for Basic Calculator.
 *   Memory Usage: 43.8 MB, less than 77.13% of Java online submissions for Basic Calculator.
 *
 * Reference
 *   https://leetcode.com/problems/basic-calculator/discuss/62421/3ms-java-concise-and-fast-recursive-solution-with-comments(beats-99.61)
 */
class Solution0224_1 {
    public int calculate(String s) {
        if (s.length() == 0) return 0;
        s = "(" + s + ")";
        int[] p = {0};
        return eval(s, p);
    }
// calculate value between parentheses
    private int eval(String s, int[] p){
        int val = 0;
        int i = p[0];
        int oper = 1; //1:+ -1:-
        int num = 0;
        while(i < s.length()){
            char c = s.charAt(i);
            switch(c){
                case '+': val = val + oper * num; num = 0; oper = 1; i++; break;// end of number and set operator
                case '-': val = val + oper * num; num = 0; oper = -1; i++; break;// end of number and set operator
                case '(': p[0] = i + 1; val = val + oper * eval(s, p); i = p[0]; break; // start a new eval
                case ')': p[0] = i + 1; return val + oper * num; // end current eval and return. Note that we need to deal with the last num
                case ' ': i++; continue;
                default : num = num * 10 + c - '0'; i++;
            }
        }
        return val;
    }
}