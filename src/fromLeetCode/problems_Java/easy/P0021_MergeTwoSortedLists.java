package fromLeetCode.problems_Java.easy;

/*
    Related Topics
    -> Linked List
    -> Recursion

    Problem
    -> https://leetcode.com/problems/merge-two-sorted-lists/

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
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


/**
 * Approach 1 -> Iterative
 *
 *
 * Time Complexity -> O(n)
 *
 * Space Complexity -> O(n)
 *
 * Result
 *   Runtime 1 ms Beats 79.94% | Memory 43.4 MB Beats 23.91%
 */
class MergeTwoSortedLists_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode(0);
        ListNode node = head;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;

        }

        if (list1 != null) node.next = list1;
        if (list2 != null) node.next = list2;

        return head.next;
    }
}



/**
 * Approach 2 -> Recursive
 *
 *
 * Time Complexity ->
 *
 * Space Complexity ->
 *
 * Result
 *   Runtime 1 ms Beats 79.94% | Memory 43.1 MB Beats 38.76%
 *
 * Reference
 *   https://leetcode.com/problems/merge-two-sorted-lists/solutions/9715/java-1-ms-4-lines-codes-using-recursion/?orderBy=most_votes
 */
class MergeTwoSortedLists_21_2_Recursion {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}