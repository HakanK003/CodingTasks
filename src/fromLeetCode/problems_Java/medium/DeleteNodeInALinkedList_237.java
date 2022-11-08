package fromLeetCode.problems_Java.medium;

public class DeleteNodeInALinkedList_237 {

    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Delete Node in a Linked List.
    //Memory Usage: 41.8 MB, less than 89.82% of Java online submissions for Delete Node in a Linked List.
    public void deleteNode(ListNode node) {

        //just
        node.val = node.next.val;
        node.next = node.next.next;


//        if(node==null || node.next==null) return;
//
//        node.val = node.next.val;
//        node.next= node.next.next;
//        deleteNode(node.next);

    }

}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */