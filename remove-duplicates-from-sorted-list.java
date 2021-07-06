//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p,c;
        p=head;
        if(p==null||p.next==null){
            return p;
        }
        else{
            c=p.next;
            while(c!=null){
                if(c.val==p.val){
                    p.next=c.next;
                    c=p.next;
                }
                else{
                    p=c;
                    if(c!=null){
                        c=c.next;
                    }
                }
            }
            return head;
        }
    }
}