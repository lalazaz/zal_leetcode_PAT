package 剑指offer_01;
//剑指 Offer 18. 删除链表的节点

/**
 * @author zal
 * @date 2022/4/21 17:45
 */
public class Demo18 {
    public static void main(String[] args) {

    }

    public static ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) return head.next;
        ListNode cur = head;
        //一个节点无法自己删除自己,所以要使用他的前一个节点
        /*if (cur.val == val) {
            head.next = head.next.next;
            return head;
        }*/
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
                return head;
            }
            cur = cur.next;
        }
        return null;
    }
}
