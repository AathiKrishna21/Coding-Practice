//https://leetcode.com/problems/binary-tree-right-side-view/

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
    public void right(TreeNode root,HashSet<Integer> h,List<Integer> n,int c){
        if(root==null){
            return;
        }
        if(!h.contains(c)){
            n.add(root.val);
            h.add(c);
        }
        right(root.right,h,n,c+1);
        right(root.left,h,n,c+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        HashSet<Integer> h=new HashSet<Integer>();
        List<Integer> n=new ArrayList<Integer>();
        if(root==null){
            return new ArrayList<Integer>();
        }
        h.add(0);
        n.add(root.val);
        right(root,h,n,0);
        return n;
    }
}