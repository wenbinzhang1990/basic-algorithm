package com.wenbin.logic.linklist;

/**
 * 奇偶链表 https://leetcode-cn.com/problems/odd-even-linked-list/
 */
public class OddEvenLinkedList {

  public ListNode oddEvenList(ListNode head) {
    if (head == null) {
      return head;
    }
    ListNode evenHead = head.next;
    ListNode odd = head, even = evenHead;
    while (even != null && even.next != null) {
      odd.next = even.next;
      odd = odd.next;
      even.next = odd.next;
      even = even.next;
    }

    odd.next = evenHead;
    return head;
  }


  public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }
}
