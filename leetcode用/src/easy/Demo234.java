package easy;
//234. 回文链表

import java.util.List;

/**
 * @author zal
 * @date 2022/5/3 23:06
 */
public class Demo234 {
    public static void main(String[] args) {
        ListNode root = new ListNode(3);
        ListNode root2 = new ListNode(1);
        ListNode root3 = new ListNode(2);
        ListNode root4 = new ListNode(3);
        root.next = root2;
        root2.next = root3;
        root3.next = root4;
        System.out.println(isPalindrome(root));
    }

    public static boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode cur = head;
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        int mid = len % 2 == 0 ? len / 2: len / 2 +1;
        ListNode left = head;
        ListNode right = head;
        while (mid-- != 0) right = right.next;
        while (right != null) {
            s1.append(left.val);
            s2.append(right.val);
            left = left.next;
            right = right.next;
        }
        return s1.reverse().toString().equals(s2.toString());
    }
}
