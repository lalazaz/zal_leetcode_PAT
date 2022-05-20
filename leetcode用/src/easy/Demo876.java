package easy;
//876. 链表的中间结点

import java.util.List;

/**
 * @author zal
 * @date 2022/4/25 10:03
 */
public class Demo876 {
    public static void main(String[] args) {

    }
    //快慢指针，慢指针走一下，快指针走两个，快指针到末尾，返回慢指针位置
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head,fast = head;
        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
