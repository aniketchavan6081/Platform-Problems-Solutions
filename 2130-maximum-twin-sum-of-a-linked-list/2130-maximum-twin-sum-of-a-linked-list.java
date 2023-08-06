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
    public int pairSum(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        
        temp = head;
        
        int arr[] = new int[len];
        int n = 0;
        while(head != null){
            arr[n] = head.val;
            n++;
            head = head.next;
        }
        
        int mxs = 0;
        
        for(int i = 0; i < n/2; i++){
            int tmx = arr[i] + arr[n-1-i];
            if(tmx > mxs){
                mxs = tmx;
            }
        }
        
        return mxs;
    }
}