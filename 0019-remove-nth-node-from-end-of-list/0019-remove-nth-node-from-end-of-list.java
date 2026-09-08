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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int jump = 0;
        ListNode l = head;
        
        // 1. Calculate the total length
        while (l != null) {
            l = l.next;
            jump++;
        }
        
        // 2. Move 'prev' to the node right before the one to remove (jump - n steps)
        ListNode prev = dummy;
        int steps = jump - n;
        while (steps > 0) {
            prev = prev.next;
            steps--;
        }
        
        // 3. Remove the target node
        prev.next = prev.next.next;
        return dummy.next;
    }
}