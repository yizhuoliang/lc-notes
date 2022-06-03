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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean carry = false;
        ListNode ans = new ListNode(0, null);
        ListNode current = ans;
        while (true) {
            
            // update value
            if (l1 == null) current.val = 0 + l2.val;
            else if (l2 == null) current.val = l1.val + 0;
            else current.val = l1.val + l2.val;
            
            // handle carry
            if (carry) {
                current.val++;
                carry = false;
            }
            
            if (current.val >= 10) {
                current.val -= 10;
                carry = true;
            }
            
            // prepare for next iteration
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            // update current and termination
            if (l1 == null && l2 == null) {
                if (carry == true) current.next = new ListNode(1, null);
                break;
            }
            current.next = new ListNode(0, null);
            current = current.next;
        }
        return ans;
    }
}