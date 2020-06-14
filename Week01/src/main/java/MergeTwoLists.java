//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-06-14<p>
//-------------------------------------------------------

public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        head = getHead(head, l1, l2);
        return head;
    }

    public ListNode getHead(ListNode head, ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            head = l2;
            return head;
        }
        if (l2 == null) {
            head = l1;
            return head;
        }
        if (l1.val < l2.val) {
            head = l1;
            l1 = l1.next;
        } else {
            head = l2;
            l2 = l2.next;
        }
        head.next = getHead(head.next, l1, l2);
        return head;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}