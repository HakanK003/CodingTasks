package fromLeetCode.problems_Java.medium;

/*
    Related Topics
    -> Linked List
    -> Math
    -> Recursion

    Problem
    -> https://leetcode.com/problems/add-two-numbers/

        You are given two non-empty linked lists representing two non-negative integers.
        The digits are stored in reverse order, and each of their nodes contains a single digit.
        Add the two numbers and return the sum as a linked list.

        You may assume the two numbers do not contain any leading zero, except the number 0 itself.

    Examples
    -> Example 1
            Input: l1 = [2,4,3], l2 = [5,6,4]
            Output: [7,0,8]
            Explanation: 342 + 465 = 807
    -> Example 2
            Input: l1 = [0], l2 = [0]
            Output: [0]
    -> Example 3
            Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
            Output: [8,9,9,9,0,0,0,1]

    Constraints
    -> The number of nodes in each linked list is in the range [1, 100].
    -> 0 <= Node.val <= 9
    -> It is guaranteed that the list represents a number that does not have leading zeros.
 */

// Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      public String toString(){
           return "["+val+"]";
    }
  }


/**
 * Approach 1 -> Math with While Loop
 *
 *   Loop trough LinkedLists and go by summing them
 *
 * Time Complexity -> O(n)
 *   n = length of max LinkedList
 *
 * Space Complexity -> O(n)
 *   n = length of max LinkedList
 *
 * Result
 *   Runtime: 3 ms, faster than 81.60% of Java online submissions for Add Two Numbers.
 *   Memory Usage: 48.2 MB, less than 16.63% of Java online submissions for Add Two Numbers.
 *
 * Reference
 *   https://leetcode.com/problems/add-two-numbers/solution/
 */
class Solution0002_1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int carr = 0;

        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;

            int sum = x + y + carr;

            carr = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carr != 0) {
            curr.next = new ListNode(carr);
        }

        return dummy.next;
    }
}



/**
 * Approach 2 -> Recursion
 *
 *   Loop trough LinkedLists and go by summing them
 *
 * Time Complexity -> O(n)
 *   n = length of max LinkedList
 *
 * Space Complexity -> O(n)
 *   n = length of max LinkedList
 *
 * Result
 *   Runtime: 3 ms, faster than 81.60% of Java online submissions for Add Two Numbers.
 *   Memory Usage: 47.6 MB, less than 59.66% of Java online submissions for Add Two Numbers.
 *   Second
 *   Runtime: 4 ms, faster than 54.45% of Java online submissions for Add Two Numbers.
 *   Memory Usage: 47.6 MB, less than 59.66% of Java online submissions for Add Two Numbers.
 *
 * Reference
 *   https://leetcode.com/problems/add-two-numbers/discuss/666314/Java-recursive-solution-and-2-iterative-solutions-with-space-complexity-O(m%2Bn)-and-O(1)
 *   https://leetcode.com/problems/add-two-numbers/discuss/1317296/Java-1ms-Recursive-Solution-1ms-Faster-than-100
 */
class Solution0002_2 {
    int carry = 0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if(l1 == null && l2 == null)
            return null;
        int x = l1 != null ? l1.val : 0;
        int y = l2 != null ? l2.val : 0;
        int sum = x + y + carry;
        carry = sum / 10;
        ListNode result = new ListNode(sum % 10);
        l1 = (l1 != null) ? l1.next : null;
        l2 = (l2 != null) ? l2.next : null;
        result.next = addTwoNumbers(l1, l2);
        if(result.next == null && carry > 0)
            result.next = new ListNode(1);

        return result;
    }
}

class Solution0002_3 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }
    private ListNode addTwoNumbers(ListNode l1, ListNode l2, int overflow) {
        if (l1 == null && l2 == null && overflow == 0) return null;
        int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + overflow;
        l1 = (l1 == null ? null : l1.next);
        l2 = (l2 == null ? null : l2.next);
        return new ListNode(sum % 10, addTwoNumbers(l1, l2, sum / 10));
    }
}