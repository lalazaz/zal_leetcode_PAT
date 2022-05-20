package 数据结构入门;
//206. 反转链表

/**
 * @author zal
 * @date 2022/5/11 8:34
 */
public class Demo206 {
    public static void main(String[] args) {

    }

    //不太熟悉
    public static ListNode reverseList(ListNode head) {
        ListNode cur = null;
        ListNode pre = null;
        while (head!=null){
            cur = head;
            head = head.next;
            cur.next = pre;
            pre = cur;
        }
        return cur;
    }
}
