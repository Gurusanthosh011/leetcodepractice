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
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        List<Integer> l1=new ArrayList<>();
        Queue<TreeNode> q1=new LinkedList<>();
        q1.add(root);
        while(!q1.isEmpty()){
            TreeNode t=q1.poll();
            l1.add(t.val);
            if(t.left!=null){
                q1.add(t.left);
            }
            if(t.right!=null){
                q1.add(t.right);
            }
        }
        return l1.size();
        
    }
}