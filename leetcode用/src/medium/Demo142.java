package medium;
//142. 环形链表 II

import java.util.List;

/**
 * @author zal
 * @date 2022/5/18 9:12
 */
public class Demo142 {
    public static void main(String[] args) {

    }

    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                ListNode l1 = fast;
                ListNode l2 = head;
                //两个指针，分别从相遇节点和头节点各走一步，再次相遇即是环入口
                while (l1!=l2){
                    l2 = l2.next;
                    l1 = l1.next;
                }
                return l1;
            }
        }
        return null;
    }


    //不对
/*    public static ListNode detectCycle(ListNode head) {
        if (head==null)return null;
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode cur = head;
        int i = 0;
        while (cur.next != null) {
            if (map.containsKey(cur.next.val)) {
                int index = map.get(cur.next.val);
                ListNode res = head;
                for (int j = 0; j < index-1; j++) {
                    res = res.next;
                }
                return res;
            }
            i++;
            map.put(cur.val, i);
            cur = cur.next;
        }
        return null;
    }*/
}
