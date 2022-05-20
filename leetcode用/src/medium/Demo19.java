package medium;
//19. 删除链表的倒数第 N 个结点

import java.util.List;

/**
 * @author zal
 * @date 2022/4/25 10:35
 */
public class Demo19 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = removeNthFromEnd(listNode, 1);
        while (listNode1!=null){
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        }
    }

    //快慢指针，快指针比慢指针快N个结点，快指针到达末尾，删除慢指针的结点
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode _slow = new ListNode();
        _slow.next = head;
        ListNode fast = head;
        while (n-- != 0) fast = fast.next;
        //如果总共有n个结点，然后删除倒数第n个结点，我们就返回第二个结点
        if (fast==null)return _slow.next.next;//也就是head.next

        while (fast!=null){
            _slow = _slow.next;
            fast = fast.next;
        }
        //此时的_slow就是我们要删除的结点的前一个结点，把他后面的删掉
        _slow.next = _slow.next.next;
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
