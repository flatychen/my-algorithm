package flaty.swordToOffer._06从尾到头打印链表;

import java.util.ArrayList;
import java.util.List;

/**
 * @author flaty
 * @date 2020-5-27
 */
public class Solution {

    //   Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int[] reversePrint(ListNode head) {
        List<Integer> result = new ArrayList<>();
        reversePrint(head, result);
        return result.stream().mapToInt(i -> i).toArray();
    }

    private void reversePrint(ListNode head,  List<Integer> result) {
        if (head == null) {
            return;
        }
        reversePrint(head.next, result);
        result.add(head.val);
    }

}