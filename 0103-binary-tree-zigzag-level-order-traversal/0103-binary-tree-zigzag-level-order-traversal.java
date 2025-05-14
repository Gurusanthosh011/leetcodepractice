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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l1=new ArrayList<>();
        if (root == null) return l1;
        Queue<TreeNode> q1=new LinkedList<>();
        q1.add(root);
        int f=0;
        while(!q1.isEmpty()){
            List<Integer> l2=new ArrayList<>();
            int size=q1.size();
            
            for(int i=0;i<size;i++){
                TreeNode t2=q1.poll();
                l2.add(t2.val);
                if(t2.left!=null){
                    q1.add(t2.left);

                }
                if(t2.right!=null){
                    q1.add(t2.right);
                }
            }
            if(f==1){
                Collections.reverse(l2);
            }
            
            l1.add(l2);
            if(f==0){
                f=1;
            }
            else{
                f=0;
            }
        }
        return l1;

    }
}