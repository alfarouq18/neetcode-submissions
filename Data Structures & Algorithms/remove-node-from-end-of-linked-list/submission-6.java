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

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head.next == null){
            return null;
        }

        ListNode l = head;
        ListNode r = head;
        
        int count = 0;
        while(count < n){
            r = r.next;
            count++;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        while(r != null){
            r = r.next;
            l = l.next;
            dummy = dummy.next;
        }
        dummy.next = l.next;
        if(dummy.val == -1){
            head = dummy.next;
        }

        return head;

    }
}
