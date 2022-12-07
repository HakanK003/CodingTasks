package fromLeetCode.problems_Java.sp_DataStructure_1.day09;

import java.util.Stack;


/*
    Related Topics
    -> Stack
    -> String

    Problem
    -> https://leetcode.com/problems/valid-parentheses/

        You are given the heads of two sorted linked lists list1 and list2.
        Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
        Return the head of the merged linked list.

    Examples
    -> Example 1
            Input: list1 = [1,2,4], list2 = [1,3,4]
            Output: [1,1,2,3,4,4]
    -> Example 2
            Input: list1 = [], list2 = []
            Output: []
    -> Example 3
            Input: list1 = [], list2 = [0]
            Output: [0]

    Constraints
    -> The number of nodes in both lists is in the range [0, 50].
    -> -100 <= Node.val <= 100
    -> Both list1 and list2 are sorted in non-decreasing order.
 */


/**
 * Approach 1 -> Stack
 *
 *
 * Time Complexity -> O(n)
 *
 * Space Complexity -> O(n)
 *
 * Result
 *  First
 *   Runtime 2 ms Beats 88.98% | Memory 40.1 MB Beats 96.29%
 *  Second
 *   Runtime 2 ms Beats 88.98% | Memory 39.9 MB Beats 99.63%
 */
class Solution0020_1 {
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
}

class Solution0020_2 {
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