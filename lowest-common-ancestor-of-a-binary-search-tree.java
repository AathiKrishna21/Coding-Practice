//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int a=p.val, b=q.val;
        if((a<=root.val && root.val<=b)||(a>=root.val && root.val>=b)){
            return root;
        }
        else if(b<root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        else
            return lowestCommonAncestor(root.right,p,q);
    }
}