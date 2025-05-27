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
    public boolean isSymmetric(TreeNode root) {

        TreeNode left1=root.left;
        List<List<Integer>> l1=new ArrayList<>();
        List<List<Integer>> l3=new ArrayList<>();
        Queue<TreeNode>  q1=new LinkedList<>();
         Queue<TreeNode>  q2=new LinkedList<>();
        q1.add(left1);
        while(!q1.isEmpty()){
            int size=q1.size();
            
            List<Integer> l2=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode s=q1.poll();
                
                if(s==null){
                    l2.add(null);
                    continue;
                }
                l2.add(s.val);
                
                    q1.add(s.left);
                
               
                    q1.add(s.right);
                
            }
            l1.add(l2);
            
        }



            TreeNode right1=root.right;
         q2.add(right1);
        while(!q2.isEmpty()){
            int size=q2.size();
            
            List<Integer> l4=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode s=q2.poll();
               

                if(s==null) {
                    l4.add(null);
                    continue;
                }
                 l4.add(s.val);  
                
                    q2.add(s.left);
                
                
                    q2.add(s.right);
                
            }
            Collections.reverse(l4);

            l3.add(l4);
            
        }



return l1.equals(l3);



        
    }
}