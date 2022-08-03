package fromLeetCode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbers {

    public static void main(String[] args) {

        System.out.println((Solution.addTwoNumbers(new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))))
                , new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))).toString());

    }


}


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

class Solution {

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//        int num1 =0, num2 =0, sum =0, a=10, b=10;
//
//        ListNode currentNode1 = l1;
//        ListNode nextNode1 = l1.next;
//
//        do{
//            num1+=(currentNode1.val*a);
//            a*=10;
//            currentNode1 = nextNode1;
//            nextNode1 = nextNode1.next;
//        }
//        while(nextNode1!=null);
//
//        ListNode currentNode2 = l2;
//        ListNode nextNode2 = l2.next;
//
//        do{
//            num2+=(currentNode2.val*b);
//            b*=10;
//            currentNode2 = nextNode2;
//            nextNode2 = nextNode2.next;
//        }
//        while(nextNode2!=null);
//
//        sum=num1+num2;
//        if (sum<10) return new ListNode(sum);
//
//        ListNode result;
//
//        ListNode lastNodeForResult = new ListNode(sum%10);
//        ListNode previousNodeForResult;
//
//        do{
//
//            sum=sum/10;
//            previousNodeForResult = new ListNode(sum%10, lastNodeForResult);
//            result = previousNodeForResult;
//            lastNodeForResult = previousNodeForResult;
//
//        }
//        while(sum>0);
//
//        return result;
//
//    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sum=0, x=0, y=0;

        ListNode currentNode1 = l1;
        ListNode nextNode1 = l1.next;

        ListNode currentNode2 = l2;
        ListNode nextNode2 = l2.next;

        ListNode result = new ListNode();

        ListNode lastNodeForResult = new ListNode();
        ListNode previousNodeForResult;

        while(nextNode1!=null || nextNode2!=null){

            if (nextNode1!=null) {
                x = currentNode1.val;
                currentNode1 = nextNode1;
                nextNode1 = nextNode1.next;
            }else{
                x = 0;
            }
            if (nextNode2!=null){
                y = currentNode2.val;
                currentNode2 = nextNode2;
                nextNode2 = nextNode2.next;
            }else{
                y = 0;
            }

            sum+=(x+y);

            previousNodeForResult = new ListNode( (sum>9)? sum%10 : sum, lastNodeForResult);
            result = previousNodeForResult;
            lastNodeForResult = previousNodeForResult;

            if (sum>9) sum=1; else sum=0;

        }

        return result;

    }

    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {

    ListNode dummy = new ListNode(-1);
    ListNode current = dummy;
    int carry = 0;

        while (l1 != null || l2 != null) {

        int x = l1 == null ? 0 : l1.val;
        int y = l2 == null ? 0 : l2.val;

        int sum = x + y + carry;

        carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

        if (l1 != null) {
            l1 = l1.next;
        }
        if (l2 != null) {
            l2 = l2.next;
        }

    }

        if (carry != 0) {
            current.next = new ListNode(carry);
    }

        return dummy.next;
}


}