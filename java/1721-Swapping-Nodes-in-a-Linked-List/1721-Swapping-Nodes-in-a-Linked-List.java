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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode current = head;
        ListNode target = null;
        int i = 1;
        while(true){
            if(i == k){
                target = current;
            }
            current = current.next;
            if(current == null) break;
            i++;
        }
        k = i-k+1;
        i = 1;
        current = head;
        while(true){
            if(i == k){
                int temp = target.val;
                target.val = current.val;
                current.val = temp;
                break;
            }
            current = current.next;
            i++;
        }
        return head;
    }
}