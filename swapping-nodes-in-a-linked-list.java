//https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
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
    public ListNode swapNodes(ListNode head, int n) {
        ListNode r,l,f;
        r=head;
        while(n!=1){
            if(r.next!=null){
            r=r.next;
            n--;
            }
            else{
                return head.next;
            }
        }
        f=r;
        l=head;
        while(r.next!=null){
            r=r.next;
            l=l.next;
        }
        int t=f.val;
        f.val=l.val;
        l.val=t;
        return head;
    }
}