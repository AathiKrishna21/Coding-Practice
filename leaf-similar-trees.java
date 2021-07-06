//https://leetcode.com/problems/leaf-similar-trees/
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
    public void dfs(TreeNode p,List<Integer> l1){
        if(p!=null){
            if(p.right==null && p.left==null){
                l1.add(p.val);
            }
            else{
                dfs(p.right,l1);
                dfs(p.left,l1);
            }
        }
    }
    public boolean leafSimilar(TreeNode p, TreeNode q) {
        List<Integer> l1=new ArrayList();
        List<Integer> l2=new ArrayList();
        dfs(p,l1);
        dfs(q,l2);
        return l1.equals(l2);
    }
}