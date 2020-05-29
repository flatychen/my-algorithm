package flaty.swordToOffer._06从尾到头打印链表;

/**
 * @author flaty
 * @date 2020-5-27
 */
public class SolutionLinked2 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int[] reversePrint(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        ListNode next = null;
        int size = 0;
        while (cur != null) {
            next = cur.next;
            //头节点
            if (pre == null) {
                cur.next = null;
                // 非头节点
            } else {
                cur.next = pre;
            }
            pre = cur;
            cur = next;
            size++;
        }
        int[] result = new int[size];
        for (int i = 0; pre != null; ) {
            result[i++] = pre.val;
        }
        return result;
    }


}