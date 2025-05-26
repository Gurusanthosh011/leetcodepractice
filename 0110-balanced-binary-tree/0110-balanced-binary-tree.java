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
    public boolean isBalanced(TreeNode root) {
        return checkheight(root)!=-1;
    }
        public int checkheight(TreeNode root) {
            if(root==null ){
                return 0;
            }
        
        int left1=checkheight(root.left);
            if(left1==-1){
                return -1;
            
        }

        int right1=checkheight(root.right);
            if(right1==-1){
                return -1;
            }
        


        if(Math.abs(left1-right1)>1){
            return -1;
        }


        return 1+Math.max(left1,right1);
         
         
         
         
    }}