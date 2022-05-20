package 数据结构入门;
//83. 删除排序链表中的重复元素

/**
 * @author zal
 * @date 2022/5/11 8:39
 */
public class Demo83 {
    public static void main(String[] args) {

    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur!=null&&cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            }
            if(cur.next==null)
                break;
            if(cur.val != cur.next.val)
                cur = cur.next;
        }
        return head;
    }
}
