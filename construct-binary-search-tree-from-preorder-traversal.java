//https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal
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
    public static int i=0;
    public static TreeNode construct(int pre[], int m) 
    {
        if(i>=pre.length||pre[i]>m){
            return null;
        }

        TreeNode root=new TreeNode(pre[i]);
        root.left=null;
        root.right=null;
        i=i+1;
        root.left=construct(pre,root.val);
        root.right=construct(pre,m);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        i=0;
        return construct(preorder,Integer.MAX_VALUE);
    }
}