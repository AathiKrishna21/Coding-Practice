//https://leetcode.com/problems/swap-nodes-in-pairs/
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
    public ListNode back(ListNode a){
        ListNode c,b;
        b=a;
        c=b.next;
        c.next=b;
        b.next=null;
        return c;
    }
    public ListNode swapPairs(ListNode head) {
        ListNode a,b,d;
        if(head==null || head.next==null){
            return head;
        }
        a=head;
        b=head.next.next;
        ListNode c=back(a);
        d=c.next;
        while(b!=null){
            if(b.next==null){
                d.next=b;
                break;
            }
            a=b;
            b=a.next.next;
            d.next=back(a);
            d=d.next.next;
        }
        return c;
    }
}