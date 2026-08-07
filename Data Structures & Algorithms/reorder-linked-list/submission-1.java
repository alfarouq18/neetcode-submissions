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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode nextHalf = slow.next;
        slow.next = null;

        ListNode curr = nextHalf, prev = null, next;

        while(curr != null){
            next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode first = head;

        while(prev != null){
            ListNode t1 = first.next;
            ListNode t2 = prev.next;
            first.next = prev;
            prev.next = t1;
            first = t1;
            prev = t2;
        }
    }
}
