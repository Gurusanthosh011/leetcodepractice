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
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Boolean> h1=new HashMap<>();
        ListNode current=head;
        
        while(current!=null){
            if(h1.containsKey(current)){
                return true;
            }
            h1.put(current,true);
            current=current.next;
            
        }
        return false;
        
    }
}