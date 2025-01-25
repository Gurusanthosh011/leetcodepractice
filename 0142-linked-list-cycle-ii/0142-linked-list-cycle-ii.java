/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode,Integer> h1=new HashMap<>();
        ListNode current=head;int t=1;
        
        while(current!=null){
            if(h1.containsKey(current)){
                int val=h1.get(current);
               System.out.print("tail connects to node index ");
               return current;

            }
            h1.put(current,t);
            t++;
            current=current.next;
            
        }
        System.out.print("no cycle");
        return null;
    }
}