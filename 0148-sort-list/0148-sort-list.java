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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        List<Integer> values = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            values.add(temp.val);
            temp = temp.next;
        }

        Collections.sort(values);

        temp = head;
        for (int val : values) {
            temp.val = val;
            temp = temp.next;
        }

        return head;
    }
}