//https://leetcode.com/problems/binary-tree-preorder-traversal/
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
    public void back(List<Integer> t,TreeNode root){
        if(root!=null){
            t.add(root.val);
            back(t,root.left);
            back(t,root.right);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> t=new ArrayList<Integer>();
        back(t,root);
        return t;
    }
}