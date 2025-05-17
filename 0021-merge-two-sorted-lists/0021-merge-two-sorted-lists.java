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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode t1=list1;
        while(t1.next!=null){
            t1=t1.next;
        }
        t1.next=list2;
        List<Integer> l1=new ArrayList<>();
        ListNode temp=list1;
        while(temp!=null){
            l1.add(temp.val);
            temp=temp.next;
        }

        Collections.sort(l1);
        int index=0;
        ListNode temp2=list1;
        while(temp2!=null){
            temp2.val=l1.get(index);
            temp2=temp2.next;
            index++;
        }
        return list1;

    }
}