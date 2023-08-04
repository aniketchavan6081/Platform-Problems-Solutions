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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = new ListNode();
        ListNode ptr = temp;
        int s = 0;
        head = head.next;
        while(head != null)
        {
            if(head.val == 0)
            {
                ListNode res = new ListNode(s);
                ptr.next = res;
                ptr = ptr.next;
                s = 0;
            }
            else
                s += head.val;
            head = head.next;
        }
        return temp.next;
    }
}