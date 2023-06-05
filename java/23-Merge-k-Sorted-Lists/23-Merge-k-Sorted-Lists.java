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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> total = new ArrayList<>();
        for(ListNode node : lists){
            ListNode current = node;
            while(current != null){
                total.add(current.val);
                current = current.next;
            }
        }
        int[] arr = new int[total.size()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = total.get(i);
        }
        Arrays.sort(arr);
        if(arr.length == 0)
            return null;
        ListNode node = new ListNode();
        node.val = arr[0];
        ListNode current = node;
        for(int i = 1; i < arr.length; i++){
            ListNode temp = new ListNode();
            temp.val = arr[i];
            current.next = temp;
            current = temp;
        }
        return node;
    }
}