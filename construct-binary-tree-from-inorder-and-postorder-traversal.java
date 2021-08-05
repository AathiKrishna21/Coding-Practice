/**
 * Definition for a binary tree node.
//https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/ 
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
    int postindex=0;
    Map<Integer,Integer> h=new HashMap<>();
    public TreeNode back(int[] io,int[] po,int is,int ie,int ps,int pe){
        if(ie<is||pe<ps){
            return null;
        }
        int ri=h.get(po[pe]);
        TreeNode root=new TreeNode(io[ri]);
        TreeNode left=back(io,po,is,ri-1,ps,ps+ri-is-1);
        TreeNode right=back(io,po,ri+1,ie,ps+ri-is,pe-1);
        root.left=left;
        root.right=right;
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;
        for(int i=0;i<n;i++){
            h.put(inorder[i],i);
        }
        postindex=n-1;
        return back(inorder,postorder,0,n-1,0,n-1);
    }
}