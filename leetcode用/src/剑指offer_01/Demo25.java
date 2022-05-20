package 剑指offer_01;
//剑指 Offer 25. 合并两个排序的链表

import java.util.LinkedList;
import java.util.List;

/**
 * @author zal
 * @date 2022/4/22 19:10
 */
public class Demo25 {
    public static void main(String[] args) {
        ListNode listNode11 = new ListNode(1);
        ListNode listNode12 = new ListNode(2);
        ListNode listNode13 = new ListNode(4);
        listNode11.next = listNode12;
        listNode12.next = listNode13;

        ListNode listNode21 = new ListNode(1);
        ListNode listNode22 = new ListNode(3);
        ListNode listNode23 = new ListNode(4);
        listNode21.next = listNode22;
        listNode22.next = listNode23;

        ListNode listNode = mergeTwoLists(listNode11, listNode21);
        while (listNode.next != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    /**
     * @ 😶 (leetcode评论)
     * 建一个伪结点，比较两个链表值的大小，指向值小的那个结点，放到结果的后面
     * 一个动态结点等于伪结点，但会不断变化
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0);
        ListNode cur = dum;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
                cur = cur.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
                cur = cur.next;
            }
        }
        cur.next = l1 == null ? l2 : l1;
        return dum.next;
    }
}
