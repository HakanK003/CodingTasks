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

    Notes
     * @param {ListNode} l1
     * @param {ListNode} l2
     * @return {ListNode}
 */


// Definition for singly-linked list.
 function ListNode(val, next) {
     this.val = (val===undefined ? 0 : val)
     this.next = (next===undefined ? null : next)
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
 *   Runtime: 219 ms, faster than 12.71% of JavaScript online submissions for Add Two Numbers.
 *   Memory Usage: 47 MB, less than 78.88% of JavaScript online submissions for Add Two Numbers.
 *
 * Reference
 *   https://leetcode.com/problems/add-two-numbers/discuss/1020/Javascript-solution
 */
 var addTwoNumbers = function(l1, l2) {
    var List = new ListNode(0);
    var head = List;
    var sum = 0;
    var carry = 0;

    while(l1!==null||l2!==null||sum>0){

        if(l1!==null){
            sum = sum + l1.val;
            l1 = l1.next;
        }
        if(l2!==null){
            sum = sum + l2.val;
            l2 = l2.next;
        }
        if(sum>=10){
            carry = 1;
            sum = sum - 10;
        }

        head.next = new ListNode(sum);
        head = head.next;

        sum = carry;
        carry = 0;

    }

    return List.next;
 };



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
  *   https://leetcode.com/problems/add-two-numbers/discuss/399562/Javascript-Recursion!
  */
var addTwoNumbers = function(l1, l2) {
  return add(l1, l2, 0);

  function add(l1, l2, carry) {
    const v1 = (l1 && l1.val) || 0;
    const v2 = (l2 && l2.val) || 0;
    const sum = v1 + v2 + carry;
    const newCarry = Math.floor(sum / 10);
    const val = sum % 10;
    return (l1 || l2 || carry) ? { val, next: add(l1 && l1.next, l2 && l2.next, newCarry) } : null;
  };
};