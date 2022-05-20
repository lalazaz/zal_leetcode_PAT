package easy;
//141. 环形链表

import java.util.List;

/**
 * @author zal
 * @date 2022/5/10 7:58
 */
public class Demo141 {
    public static void main(String[] args) {

    }

    //快慢指针
    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }
        return false;
    }

/*    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        for (int i = 0; i < 10002; i++) {
            if (head.next != null)
                head = head.next;
            else return false;
        }
        return true;
    }*/
}
