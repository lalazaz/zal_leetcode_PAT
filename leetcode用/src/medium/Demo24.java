package medium;
//24. 两两交换链表中的节点

import java.util.List;

/**
 * @author zal
 * @date 2022/5/18 8:43
 */
public class Demo24 {
    public static void main(String[] args) {

    }

    public static ListNode swapPairs(ListNode head) {
        ListNode dummmyNode = new ListNode(-1);
        dummmyNode.next = head;
        ListNode pre = dummmyNode;

        while (pre.next != null && pre.next.next != null) {
            ListNode temp = head.next.next;
            pre.next = head.next;
            pre.next.next = head;
            head.next = temp;
            pre = head;
            head = head.next;
        }

        return dummmyNode.next;
    }
}
