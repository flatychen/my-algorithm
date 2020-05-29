package flaty.swordToOffer._06从尾到头打印链表;

import java.util.ArrayList;
import java.util.List;

/**
 * @author flaty
 * @date 2020-5-27
 */
public class SolutionFor {

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
        while (head != null) {
            result.add(head.val);
            head = head.next;
        }
        int[] array = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            array[result.size() - i -1 ] = result.get(i);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }


}