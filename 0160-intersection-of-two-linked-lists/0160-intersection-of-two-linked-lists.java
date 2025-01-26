/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Integer> h1=new HashMap<>();
        ListNode current=headA;
        while(current!=null){
            h1.put(current,1);
            current=current.next;
        }
        current=headB;
        while(current!=null){
            if(h1.containsKey(current)){
                System.out.print("Intersected at"+current.val);
                return current;
            }
           else{
            h1.put(current,1);
                
                current=current.next;
           }
        }
        System.out.print("No intersection");
        return null;
    }
}