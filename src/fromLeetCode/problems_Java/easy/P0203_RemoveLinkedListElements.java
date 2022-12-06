package fromLeetCode.problems_Java.easy;

/*
    Related Topics
    -> Linked List
    -> Recursion

    Problem
    -> https://leetcode.com/problems/remove-linked-list-elements/

        Given the head of a linked list and an integer val,
        remove all the nodes of the linked list that has Node.val == val, and return the new head.

    Examples
    -> Example 1
            Input: head = [1,2,6,3,4,5,6], val = 6
            Output: [1,2,3,4,5]
    -> Example 2
            Input: head = [], val = 1
            Output: []
    -> Example 3
            Input: head = [7,7,7,7], val = 7
            Output: []

    Constraints
    -> The number of nodes in the list is in the range [0, 10^4].
    -> 1 <= Node.val <= 50
    -> 0 <= val <= 50
 */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */


/**
 * Approach 1 -> Iterative Solution without using a Previous Pointer
 *
 *
 * Time Complexity -> O(n)
 *
 *
 * Space Complexity -> O(1)
 *
 *
 * Result
 *   Runtime 5 ms Beats 29.79% | Memory 49.4 MB Beats 18.82%
 *
 * Reference
 *   https://leetcode.com/problems/remove-linked-list-elements/solutions/1572932/java-three-simple-clean-solutions-w-explanation-iterative-recursive-beats-100/
 */
class Solution0203_1 {
    public ListNode removeElements(ListNode head, int val) {

        if (head == null) return null;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;

        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

        return dummy.next;
    }
}


/**
 * Approach 2 -> Iterative Solution using a Previous Pointer
 *
 *
 * Time Complexity -> O(n)
 *
 *
 * Space Complexity -> O(1)
 *
 *
 * Result
 *   
 *
 * Reference
 *   https://leetcode.com/problems/remove-linked-list-elements/solutions/1572932/java-three-simple-clean-solutions-w-explanation-iterative-recursive-beats-100/
 */
class Solution0203_2 {
    public ListNode removeElements(ListNode head, int val) {

        if (head == null) return null;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = head;
        ListNode prev = dummy;

        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }

        return dummy.next;
    }
}


/**
 * Approach 3 -> Recursive Solution
 *
 *
 * Time Complexity -> O(n)
 *
 *
 * Space Complexity -> O(n)
 *
 *
 * Result
 *   
 *
 * Reference
 *   https://leetcode.com/problems/remove-linked-list-elements/solutions/1572932/java-three-simple-clean-solutions-w-explanation-iterative-recursive-beats-100/
 */
class Solution0203_3_Recursion {
    public ListNode removeElements(ListNode head, int val) {

        if (head == null) return null;

        ListNode rightSideHead = removeElements(head.next, val);

        if (head.val == val) return rightSideHead;

        head.next = rightSideHead;
        return head;
    }
}