package 数据结构入门;
//203. 移除链表元素

import java.util.LinkedList;
import java.util.List;

/**
 * @author zal
 * @date 2022/5/10 8:31
 */
public class Demo203 {
    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(6);
        ListNode listNode = removeElements(root, 6);
        System.out.println(listNode.val);
        //System.out.println(listNode.next.val);
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode header = new ListNode(-1);
        header.next = head;
        ListNode cur = header;
        while (cur.next!=null){
            if (cur.val == val){
                cur.next = cur.next.next;
            }else cur = cur.next;
        }
        return header.next;
    }

/*    public static ListNode removeElements(ListNode head, int val) {
        ListNode res = new ListNode();
        ListNode cur = res;
        while (head != null) {
            if (head.val != val) {
                cur.next = new ListNode(head.val);
                cur = cur.next;
            }
            head = head.next;
        }
        return res.next;
    }*/
}
