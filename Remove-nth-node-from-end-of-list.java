//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
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
        ListNode r,l;
        r=head;
        while(n!=0){
            if(r.next!=null){
            r=r.next;
            n--;
            }
            else{
                return head.next;
            }
        }
        l=head;
        while(r.next!=null){
            r=r.next;
            l=l.next;
        }
        l.next=l.next.next;
        return head;
    }
}