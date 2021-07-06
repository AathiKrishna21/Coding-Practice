//https://leetcode.com/problems/palindrome-linked-list/
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
    public boolean isPalindrome(ListNode head) {
        ListNode fp,sp;
        Stack<Integer> stack = new Stack<Integer>();
        sp=head;
        if(sp==null||sp.next==null){
            return true;
        }
        else{
            fp=sp;
            while(fp!=null && fp.next!=null){
                stack.push(sp.val);
                sp=sp.next;
                fp=fp.next.next;
            }
            
        }
        if(fp!=null){
            stack.push(sp.val);
        }
        while(!stack.isEmpty()&&sp!=null){
            System.out.println(sp.val+" "+stack.peek());

            if(sp.val!=stack.peek()){
                return false;
            }
            stack.pop();
            sp=sp.next;
        }
        return true;
    }
}