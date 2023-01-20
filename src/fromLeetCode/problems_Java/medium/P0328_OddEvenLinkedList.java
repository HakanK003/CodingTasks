package fromLeetCode.problems_Java.medium;

/*
    Related Topics
    -> Linked List

    Problem
    -> https://leetcode.com/problems/odd-even-linked-list/

        Given the head of a singly linked list, group all the nodes with
        odd indices together followed by the nodes with even indices, and return the reordered list.
        The first node is considered odd, and the second node is even, and so on.
        Note that the relative order inside both the even and odd groups should remain as it was in the input.
        You must solve the problem in O(1) extra space complexity and O(n) time complexity.

    Examples
    -> Example 1
            Input: head = [1,2,3,4,5]
            Output: [1,3,5,2,4]
    -> Example 2
            Input: head = [2,1,3,5,6,4,7]
            Output: [2,3,6,7,1,5,4]

    Constraints
    -> The number of nodes in the linked list is in the range [0, 10^4].
    -> -10^6 <= Node.val <= 10^6
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
 * Approach 1 ->
 *
 *
 *
 *
 * Time Complexity -> O(n)
 *
 * Space Complexity -> O(1)
 *
 * Result
 *  First
 *   Runtime 2 ms Beats 20.66% | Memory 44.6 MB Beats 49.14%
 *  Second
 *   Runtime 0 ms Beats 100% | Memory 45.1 MB Beats 20.87%
 *
 * Reference
 *   https://leetcode.com/problems/odd-even-linked-list/solutions/1606975/java-2-solutions-explanation-using-image-without-space/
 */
class Solution0328_1_1 {
    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode oddCurr = head, evenHead = head.next, evenCurr = head;

        while(evenCurr != null && evenCurr.next != null){

            oddCurr.next = evenCurr.next;
            oddCurr=oddCurr.next;

            evenCurr.next = oddCurr.next;
            evenCurr=evenCurr.next;

        }

        oddCurr.next=evenHead;

        return head;
    }
}



class Solution0328_1_2 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;
        // `even != null` rules out the list of only 1 node
        // `even.next != null` rules out the list of only 2 nodes
        while (even != null && even.next != null) {
            // Put odd to the odd list
            odd.next = odd.next.next;

            // Put even to the even list
            even.next = even.next.next;

            // Move the pointer to the next odd/even
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}


/**
 * Approach 2 ->
 *
 *
 *
 *
 * Time Complexity -> O(n)
 *
 * Space Complexity -> O(1)
 *
 * Result
 *   Runtime 1 ms Beats 66.18% | Memory 45 MB Beats 20.87%
 *
 * Reference
 *   https://leetcode.com/problems/odd-even-linked-list/solutions/1606975/java-2-solutions-explanation-using-image-without-space/
 */
class Solution0328_2 {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode oddHead = null, oddTail = null;
        ListNode evenHead = null, evenTail = null;
        ListNode curr = head;
        int i = 1;
        while(curr!=null){
            // generate the odd indices list
            if(i%2==1){
                if(oddHead==null){
                    oddHead = curr;
                    oddTail = curr;
                }
                else{
                    oddTail.next = curr;
                    oddTail = oddTail.next;
                }
            }
            // generate the even indices list
            else{
                if(evenHead==null){
                    evenHead = curr;
                    evenTail = curr;
                }
                else{
                    evenTail.next = curr;
                    evenTail = evenTail.next;
                }
            }
            curr = curr.next;
            i++;
        }

        evenTail.next = null;     // there should not be any node after even tail
        oddTail.next  = evenHead;   // join even list after odd
        return oddHead;
    }
}