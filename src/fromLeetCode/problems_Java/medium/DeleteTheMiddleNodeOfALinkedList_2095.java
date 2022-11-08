package fromLeetCode.problems_Java.medium;

public class DeleteTheMiddleNodeOfALinkedList_2095 {


    //Runtime: 14 ms, faster than 7.76% of Java online submissions for Delete the Middle Node of a Linked List.
    //Memory Usage: 208.4 MB, less than 72.58% of Java online submissions for Delete the Middle Node of a Linked List.
    public ListNode deleteMiddle1(ListNode head) {

        int nodeCount = 0;
        ListNode currentNode = head;

        while (currentNode.next != null) {

            nodeCount++;
            currentNode = currentNode.next;

        }

        currentNode = head;
        for (int i = 0; i < ((nodeCount % 2 == 0) ? nodeCount / 2 + 1 : nodeCount / 2); i++) {

            currentNode = currentNode.next;

        }

        if (nodeCount==0) return null;
        if (currentNode.next==null) return new ListNode(head.val);

        currentNode.val =currentNode.next.val;
        currentNode.next = currentNode.next.next;


        return head;

    }

}

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

/*
TODO Sample 63200kb solution

    public ListNode deleteMiddle(ListNode head) {
     if(head==null||head.next==null)
     {
         return null;
     }
    ListNode slowptr=head;
    ListNode fastptr=head;
    ListNode prev=null;
        while(fastptr!=null&&fastptr.next!=null)
        {   prev=slowptr;
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
        prev.next=slowptr.next;
       // slowptr.next=slowptr.next.next;
        return head;
    }

    --- --- ---

TODO Sample 4ms solution

    public ListNode deleteMiddle(ListNode head) {

        if(head==null || head.next==null) return null;

        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=new ListNode();
        temp.next=slow;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            temp=temp.next;
        }


        temp.next=slow.next;
        slow.next=null;

        return head;
    }

 */