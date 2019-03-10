package com.experiments;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        ListNode ptr1 = head;
        ListNode ptr2 = null;
        if (ptr1 != null ) ptr2 = head.next;
        if (ptr2 != null ) ptr1.next = null;

        while (ptr2 != null ){
            ListNode ptr3 = ptr2.next;
            ptr2.next = ptr1;
            ptr1 = ptr2;
            ptr2 = ptr3;
        }

        return ptr1;

    }

}




 class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

