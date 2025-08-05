/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<Integer> l1=new ArrayList<>();


        ListNode current=head;
        while(current!=null){
            l1.add(current.val);
            current=current.next;
}
int j=l1.size()-n;
l1.remove(j);
ListNode dummy=new ListNode(-1);
ListNode tail=dummy;
for(int i=0;i<l1.size();i++){
    tail.next=new ListNode(l1.get(i));
    tail=tail.next;
}
return dummy.next;
    }
}