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
    public ListNode mergeNodes(ListNode head) {
        List<Integer> a = new ArrayList<>();
        ListNode current = head;
        int sum = 0;
        while(current.next != null){
            sum+=current.val;
            if(current.next.val == 0){
                a.add(sum);
                sum = 0;
            }
            current = current.next;
        }
        ListNode result = new ListNode(a.get(0));
        a.remove(0);
        current = result;
        for(int i : a){
            current.next = new ListNode(i);
            current = current.next;
        }
        return result;
    }
}