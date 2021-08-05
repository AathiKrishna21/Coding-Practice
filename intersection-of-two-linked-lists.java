//https://leetcode.com/problems/intersection-of-two-linked-lists/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode a, ListNode b) {
        int m=0,n=0;
        ListNode p,q;
        ListNode t=a;
        while(t!=null){
            m++;
            t=t.next;
        }
        t=b;
        while(t!=null){
            n++;
            t=t.next;
        }
        if(m>n){
            int temp=m-n;
            p=a;
            while(temp!=0){
                p=p.next;
                temp--;
            }
            q=b;
        }
        else{
            int temp=n-m;
            q=b;
            while(temp!=0){
                q=q.next;
                temp--;
            }
            p=a;
        }
        while(p!=q){
            if(p==null || q==null){
                return null;
            }
            p=p.next;
            q=q.next;
        }
        return p;
    }
}