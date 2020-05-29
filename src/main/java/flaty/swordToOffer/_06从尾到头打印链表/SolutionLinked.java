package flaty.swordToOffer._06从尾到头打印链表;

/**
 * @author flaty
 * @date 2020-5-27
 */
public class SolutionLinked {

    //   Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int[] reversePrint(ListNode head) {
        int size = 0;
        ListNode cur = head;
        ListNode pre = null;
        ListNode next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
            size++;
        }
        int [] result = new int[size];
        int i = 0;
        while (pre != null) {
            result[i++] = pre.val;
            pre = pre.next;
        }
        return result;
    }


}