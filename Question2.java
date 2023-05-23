package Completed;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));
        ListNode result = s.addTwoNumbers(l1, l2);
        System.out.println(s.getNumber(result));
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        char[] chars = (getNumber(l1).add(getNumber(l2))).toString().toCharArray();
        int[] numbers = new int[chars.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(String.valueOf(chars[i]));
        }

        ListNode l3 = new ListNode(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            ListNode l4 = new ListNode(numbers[i], l3);
            l3 = l4;
        }

        return l3;
    }

    public BigInteger getNumber(ListNode ln) {
        ListNode currentNode = ln;
        List<Integer> numbers = new ArrayList<Integer>();
        while (true) {
            numbers.add(currentNode.val);
            currentNode = currentNode.next;
            if (currentNode == null)
                break;
        }
        String n1 = "";
        for (int i = numbers.size() - 1; i >= 0; i--) {
            n1 += numbers.get(i);
        }
        return new BigInteger(n1);
    }
}
