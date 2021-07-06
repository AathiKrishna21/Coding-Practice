//https://leetcode.com/problems/reverse-linked-list-ii/
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
    public ListNode reverse(ListNode node){
        ListNode prev = null;
        ListNode current = node;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode re=head,le=head,t=head,te=head;
        int l=left;
        if(left==right){
            return head;
        }
        while(t!=null){
            left--;
            right--;
            if(left==0){
                le=t;
            }
            if(right==0){
                re=t.next;
                t.next=null;
                break;
            }
            t=t.next;

        }
        t=reverse(le);
        if(l>1){
            while(te!=null){
                l--;
                if(l==1){
                    te.next=t;
                    break;
                }
                te=te.next;
            }
        }
        else if(l==1){
            head=t;
        }
        while(t.next!=null){
            t=t.next;
        }
        t.next=re;
        return head;
    }
}