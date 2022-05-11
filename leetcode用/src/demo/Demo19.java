package demo;

import java.util.ArrayList;
import java.util.List;

//@Date 2022/4/10 19:45
//19. 删除链表的倒数第 N 个结点
public class Demo19 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        /*ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);*/
        listNode1.next = listNode2;
        /*listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;*/
        ListNode cur = new ListNode();
        cur = listNode1;
        /*while (cur.next!=null){
            System.out.println(cur.val);
            cur = cur.next;
        }
        System.out.println(cur.val);*/
        ListNode listNode = removeNthFromEnd(cur, 1);
        while (listNode.next!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
        System.out.println(listNode.val);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //如果只有一个结点,且也值删除倒数第一个
        if (head.next==null&&n==1)return null;

        //删除倒数第n个  即删除第L-n个
        int L = 2;//默认两个
        ListNode cur = new ListNode();
        cur = head.next;
        while (cur.next!=null){
            L++;
            cur = cur.next;
        }
        //找到第L-n个
        cur = head;
        //System.out.println(cur.val+"fdas");
        int i = 1;
        while (i <= L-n-1){
            i++;
            //System.out.print(cur.val+"   ");
            cur = cur.next;
        }
        //System.out.println(i);
        //如果删除头节点
        if (n == L){
            return head.next;
        }

        //System.out.println("over");
        if (cur.next.next==null){
            cur.next = null;
        }else cur.next = cur.next.next;

        return head;
    }
}
//Definition for singly-linked list.
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
