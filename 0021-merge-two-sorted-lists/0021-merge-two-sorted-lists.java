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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;
        ListNode mergedHead = null;
        ListNode current = null;

        if (ptr1 == null) return ptr2;

        if (ptr2 == null) return ptr1;

        while (ptr1 != null && ptr2 != null) {
            if (ptr1.val < ptr2.val) {
                if (mergedHead == null) {
                    mergedHead = ptr1;
                    current = ptr1;
                } else {
                    current.next = ptr1;
                    current = ptr1;
                }
                ptr1 = ptr1.next;

            } else {
                if (mergedHead == null) {
                    mergedHead = ptr2;
                    current = ptr2;
                } else {
                    current.next = ptr2;
                    current = ptr2;
                }
                ptr2 = ptr2.next;
            }
        }

        if (ptr1 != null) {
            while (ptr1 != null) {
                current.next = ptr1;
                current = ptr1;
                ptr1 = ptr1.next;
            }
        } else {
            while (ptr2 != null) {
                current.next = ptr2;
                current = ptr2;
                ptr2 = ptr2.next;
            }
        }

        return mergedHead;
    }
}