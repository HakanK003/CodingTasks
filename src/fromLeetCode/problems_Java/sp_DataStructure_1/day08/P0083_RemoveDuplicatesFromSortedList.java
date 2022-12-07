package fromLeetCode.problems_Java.sp_DataStructure_1.day08;

/*
    Related Topics
    -> Linked List

    Problem
    -> https://leetcode.com/problems/remove-duplicates-from-sorted-list/

        Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
        Return the linked list sorted as well.

    Examples
    -> Example 1
            Input: head = [1,1,2]
            Output: [1,2]
    -> Example 2
            Input: head = [1,1,2,3,3]
            Output: [1,2,3]

    Constraints
    -> The number of nodes in the list is in the range [0, 300].
    -> -100 <= Node.val <= 100
    -> The list is guaranteed to be sorted in ascending order.
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}



/**
 * Approach 1 ->
 *
 *
 *
 * Time Complexity ->
 *
 *
 * Space Complexity ->
 *
 *
 * Result
 *   Runtime 0 ms Beats 100% | Memory 42.2 MB Beats 81.90%
 */
class Solution0083_1 {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode curr = head;

        while(curr != null && curr.next!=null){
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            }else {
                curr = curr.next;
            }
        }

        return head;
    }
}