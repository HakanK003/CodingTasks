package fromLeetCode.problems_Java.easy;

/*
    Related Topics
    -> Linked List
    -> Two Pointers

    Problem
    -> https://leetcode.com/problems/middle-of-the-linked-list/

        Given the head of a singly linked list, return the middle node of the linked list.
        If there are two middle nodes, return the second middle node.

    Examples
    -> Example 1
            Input: head = [1,2,3,4,5]
            Output: [3,4,5]
            Explanation: The middle node of the list is node 3.
    -> Example 2
            Input: head = [1,2,3,4,5,6]
            Output: [4,5,6]
            Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

    Constraints
    -> The number of nodes in the list is in the range [1, 100].
    -> 1 <= Node.val <= 100
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


/**
 * Approach 1 -> Nested for loop
 *
 *
 * Time Complexity ->
 *
 *
 * Space Complexity ->
 *
 *
 * Result
 *   Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
 *   Memory Usage: 41.5 MB, less than 50.95% of Java online submissions for Middle of the Linked List.
 */
class Solution0876_1 {
    public ListNode middleNode(ListNode head) {

        ListNode curr = head;
        int count = 1;

        while (curr.next != null) {
            curr = curr.next;
            count++;
        }

        curr = head;

        for (int i = 0; i < count / 2; i++) {
            curr = curr.next;
        }

        return curr;
    }
}



/**
 * Approach 2 -> Two Pointers
 *
 *
 * Time Complexity ->
 *
 *
 * Space Complexity ->
 *
 *
 * Result
 *   Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
 *   Memory Usage: 40 MB, less than 84.66% of Java online submissions for Middle of the Linked List.
 */
class Solution0876_2_TwoPointers {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}