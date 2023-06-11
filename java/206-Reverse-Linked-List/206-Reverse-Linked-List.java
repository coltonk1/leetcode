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
        ListNode n = new ListNode(l.get(l.size()-1));
        ListNode result = n;
        for(int i = l.size()-2; i >= 0; i--){
            int a = l.get(i);
            ListNode tmp = new ListNode(a);
            n.next = tmp;
            n = tmp;
        }
        return result;
    }
}