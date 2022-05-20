package 剑指offer_01;
//剑指 Offer 24. 反转链表

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author zal
 * @date 2022/4/22 17:38
 */
public class Demo24 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        System.out.println(reverseList(listNode1));
    }

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null,cur = head,next = null;
        while (cur!=null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    /**
     * 栈存储值
     */
/*    public static ListNode reverseList(ListNode head) {
        ListNode cur = head;
        Stack<Integer> stack = new Stack<>();
        while (cur != null) {
            stack.push(cur.val);
            cur = cur.next;
        }
        ListNode res = new ListNode(-1);
        ListNode res1 = new ListNode(-1);
        res1 = res;
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            res.next = new ListNode(stack.pop());
            res = res.next;
        }
        return res1.next;
    }*/
}
