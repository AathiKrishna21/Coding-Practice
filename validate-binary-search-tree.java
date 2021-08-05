//https://leetcode.com/problems/validate-binary-search-tree/

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
    public static TreeNode prev=null;
    public boolean pre(TreeNode node){
        if (node != null)
        {
            if (!pre(node.left))
                return false;
            if (prev != null && node.val <= prev.val )
                return false;
            prev = node;
            return pre(node.right);
        }
        return true;
    }
    public boolean isValidBST(TreeNode root) {
        prev=null;
        return pre(root);
    }
}