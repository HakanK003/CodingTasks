package fromLeetCode.problems_Java.sp_DataStructure_1.day07;

import java.util.HashSet;

/*
    Related Topics
    -> Hash Table
    -> Linked List
    -> Two Pointers

    Problem
    -> https://leetcode.com/problems/linked-list-cycle/

        Given head, the head of a linked list, determine if the linked list has a cycle in it.
        There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
        following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer
        is connected to. Note that pos is not passed as a parameter.
        Return true if there is a cycle in the linked list. Otherwise, return false.


    Examples
    -> Example 1
            Input: head = [3,2,0,-4], pos = 1
            Output: true
            Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
    -> Example 2
            Input: head = [1,2], pos = 0
            Output: true
            Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
    -> Example 3
            Input: head = [1], pos = -1
            Output: false
            Explanation: There is no cycle in the linked list.

    Constraints
    -> The number of the nodes in the list is in the range [0, 10^4].
    -> -10^5 <= Node.val <= 10^5
    -> pos is -1 or a valid index in the linked-list.

    Notes
     * Follow up: Can you solve it using O(1) (i.e. constant) memory?
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

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}


/**
 * Approach 1 -> Two Pointers / Floyd's Cycle Detection Algorithm / Floyd's tortoise and hare algorithm
 *
 *
 *
 * Time Complexity -> O(n)
 *
 *
 * Space Complexity -> O(1)
 *
 *
 * Result
 *   Runtime: 4 ms, faster than 29.74% of Java online submissions for Linked List Cycle.
 *   Memory Usage: 46.1 MB, less than 29.37% of Java online submissions for Linked List Cycle.
 */
class Solution0141_1_LinkedList_TraversingTwoPointers {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}


/**
 * Approach 2 -> HashSet
 *
 *
 *
 * Time Complexity -> O(n)
 *
 *
 * Space Complexity -> O(n)
 *
 *
 * Result
 *   Runtime: 12 ms, faster than 10.02% of Java online submissions for Linked List Cycle.
 *   Memory Usage: 47.5 MB, less than 7.75% of Java online submissions for Linked List Cycle.
 */
class Solution0141_2_LinkedList_HashSet {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            visited.add(curr);
            curr = curr.next;
            if (visited.contains(curr)) return true;
        }
        return false;
    }
}