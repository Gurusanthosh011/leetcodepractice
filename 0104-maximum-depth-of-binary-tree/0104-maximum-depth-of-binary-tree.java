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
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        List<List<Integer>> l1=new ArrayList<>();
        Queue<TreeNode> q1=new LinkedList<>();
        q1.add(root);
        while(!q1.isEmpty()){
            List<Integer> l2=new ArrayList<>();
            int size=q1.size();
            for(int i=0;i<size;i++){
                TreeNode temp=q1.poll();
                  l2.add(temp.val);
                  if(temp.left!=null){
                    q1.add(temp.left);
                  }
                  if(temp.right!=null){
                    q1.add(temp.right);
                  }
            }
            l1.add(l2);
        }

        return l1.size();
    }
}