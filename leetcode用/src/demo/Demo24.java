package demo;

//@Date 2022/4/13 13:11
//24. 两两交换链表中的节点
public class Demo24 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        ListNode listNode1 = swapPairs(listNode);
        System.out.println(listNode1.val);
        System.out.println(listNode1.next.val);
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        //
        ListNode cur = head.next;
        head.next = swapPairs(cur.next);
        cur.next = head;

        return cur;
    }
}
//Definition for singly-linked list.
//在Demo19