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
    public ListNode deleteMiddle(ListNode head) {
        int i = 0;
        ListNode current = head;
        int length = 0;
        while(current != null)
        {
            length++;
            current = current.next;
        }
        int n = length/2;
        current = head;
        if(length == 1) return null;
        if(n == 0){
            if(current.next == null)
                return null;
            else{
                head=current.next;
            }
            return head;
        }
        while(true){
            if(i+1==n){
                if(current.next.next!=null){
                    current.next = current.next.next;
                }
                else{
                    current.next = null;
                }
                break;
            }
            i++;
            current = current.next;
        }
        return head;
    }
}