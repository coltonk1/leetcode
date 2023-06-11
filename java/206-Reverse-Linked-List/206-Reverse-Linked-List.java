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
    public ListNode reverseList(ListNode head) {
        List<Integer> l = new ArrayList<>();
        ListNode current = head;
        if(head == null) return null;
        while(true){
            l.add(current.val);
            current = current.next;
            if(current == null) break;
        }
        current = head;
        for(int i = l.size()-1; i >= 0; i--){
            current.val = l.get(i);
            current = current.next;
        }
        return head;
    }
}