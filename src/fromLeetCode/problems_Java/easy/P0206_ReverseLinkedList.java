package fromLeetCode.problems_Java.easy;

import java.util.Stack;

/*
    Related Topics
    -> Linked List
    -> Recursion

    Problem
    -> https://leetcode.com/problems/reverse-linked-list/

        Given the head of a singly linked list, reverse the list, and return the reversed list.

    Examples
    -> Example 1
            Input: head = [1,2,3,4,5]
            Output: [5,4,3,2,1]
    -> Example 2
            Input: head = [1,2]
            Output: [2,1]
    -> Example 3
            Input: head = []
            Output: []

    Constraints
    -> The number of nodes in the list is the range [0, 5000].
    -> -5000 <= Node.val <= 5000
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */



/**
 * Approach 1 -> Stack
 *
 *
 * Time Complexity -> O(n)
 *
 *
 * Space Complexity -> O(n)
 *
 *
 * Result
 *   Runtime 4 ms Beats 5.10% | Memory 43.5 MB Beats 8.62%
 */
class Solution0206_1 {
    public ListNode reverseList(ListNode head) {

        Stack<Integer> values = new Stack<>();
        while (head != null){
            values.push(head.val);
            head=head.next;
        }

        ListNode result = new ListNode();
        ListNode resultCurr = result;

        for (int i = values.size(); i > 0; i--){
            resultCurr.next = new ListNode(values.pop());
            resultCurr = resultCurr.next;
        }

        return result.next;
    }
}


/**
 * Approach 2 -> Recursion
 *
 *
 * Time Complexity -> O(n)
 *
 *
 * Space Complexity -> O(n)
 *
 *
 * Result
 *   0 ms Beats 100% | Memory 43.6 MB Beats 5.59%
 *
 * Reference
 *   https://leetcode.com/problems/reverse-linked-list/solutions/58156/my-java-recursive-solution/?orderBy=most_votes
 */
class Solution0206_2_Recursion {
    public ListNode reverseList(ListNode head) {

        if(head==null || head.next==null) return head;

        ListNode nextNode=head.next;
        ListNode newHead=reverseList(nextNode);
        nextNode.next=head;
        head.next=null;

        return newHead;
    }
}



/**
 * Approach 3 -> Iterative
 *
 *
 * Time Complexity -> O(n)
 *
 *
 * Space Complexity -> O(n)
 *
 *
 * Result
 *   Runtime 0 ms Beats 100% | Memory 42.1 MB Beats 84.17%
 *
 * Reference
 *   https://leetcode.com/problems/reverse-linked-list/solutions/2682085/java-0ms-100-easy-understanding/?orderBy=most_votes
 */
class Solution0206_3{
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;


        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}