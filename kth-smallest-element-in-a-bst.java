//https://leetcode.com/problems/kth-smallest-element-in-a-bst/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static int c=0,t=0;
    public void pre(TreeNode root, int k){
        if(root==null){
            return;
        }
        pre(root.left,k);
        c++;
        
        if(c==k){
            t=root.val;
        }
        pre(root.right,k);
        
    }
    public int kthSmallest(TreeNode root, int k) {
        c=0;
        t=0;
        pre(root,k);
        return t;
    }
}