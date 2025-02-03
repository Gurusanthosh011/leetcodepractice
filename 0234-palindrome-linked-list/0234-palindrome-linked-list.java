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
    public boolean isPalindrome(ListNode head) {
       List<Integer> l1=new ArrayList<>() ;
      ListNode current=head;
      while(current!=null){
        l1.add(current.val);
        current=current.next;
      }

      int left=0;int right=l1.size()-1;
      while(left<right){
        if(!l1.get(left).equals(l1.get(right))){
            return false;
        }
        left++;
        right--;

      }
      return true;
    }
}