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
    public boolean hasCycle(ListNode head) {
        ListNode dummy = new ListNode(0);

        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        while(fast != null && slow != null){
            slow = slow.next;
            fast = fast.next;
            if(fast == null){
                return false;
            }else{
                fast = fast.next;
            }

            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}
