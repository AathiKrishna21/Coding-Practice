//https://leetcode.com/problems/symmetric-tree/
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
    public boolean issym(TreeNode r1,TreeNode r2){
        if((r1==null && r2==null)){
            return true;
        }
        else if(r1==null || r2==null){
            return false;
        }
        else if(r1.val==r2.val){
            return (issym(r1.left,r2.right) && issym(r1.right,r2.left));
        }
        else{
            return false;
        }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        else{
            return issym(root,root);
        }
    }
}