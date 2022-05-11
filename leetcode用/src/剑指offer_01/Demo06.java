package 剑指offer_01;
//剑指 Offer 06. 从尾到头打印链表

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * @author zal
 * @date 2022/4/21 11:51
 */
public class Demo06 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(100);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        System.out.println(Arrays.toString(reversePrint(listNode1)));
    }

    public static int[] reversePrint(ListNode head) {
        if (head == null) return new int[]{};
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        while (head.next != null) {
            stack.push(head.val);
            head = head.next;
        }
        stack.push(head.val);
        int[] res = new int[stack.size()];
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            res[i] = stack.pop();
        }
        return res;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

}
