package 剑指offer_01;
//剑指 Offer 22. 链表中倒数第k个节点

/**
 * @author zal
 * @date 2022/4/22 17:27
 */
public class Demo22 {
    public static void main(String[] args) {

    }

    /**
     * 两个指针，相隔k个结点，后面那个结点到了末尾，返回前面那个的下一个
     */
    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.next;
    }
}
