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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l1=new ArrayList<>();
        preorder(root,l1);
        return l1;
}
public void preorder(TreeNode root,List<Integer> l1){
    if(root==null){
        return;
    }
    
    preorder(root.left,l1);
    preorder(root.right,l1);
    l1.add(root.val);
}
}