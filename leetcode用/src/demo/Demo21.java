package demo;

import java.util.Arrays;

//@Date 2022/4/15 9:56
//21. 合并两个有序链表
public class Demo21 {
    public static void main(String[] args) {

        //[-10,-6,-6,-6,-3,5]
        //[]

        ListNode listNode = new ListNode(-10);
        ListNode listNode2 = new ListNode(-6);
        ListNode listNode3 = new ListNode(-6);
        ListNode listNode31 = new ListNode(-6);
        ListNode listNode32 = new ListNode(-3);
        ListNode listNode33 = new ListNode(5);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode31;
        listNode31.next = listNode32;
        listNode32.next = listNode33;

        /*ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(4);
        listNode4.next = listNode5;
        listNode5.next = listNode6;*/


/*        while (listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

        while (listNode4!=null){
            System.out.println(listNode4.val);
            listNode4 = listNode4.next;
        }*/



        System.out.println("=========之后============");
        ListNode listNode7 = mergeTwoLists(listNode, null);
        while (listNode7 != null) {
            System.out.println(listNode7.val);
            listNode7 = listNode7.next;
        }


        //

/*        ListNode listNode = new ListNode();
        ListNode listNode2 = new ListNode();

        ListNode listNode1 = mergeTwoLists(null, null);
        while (listNode1!=null){
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        }*/

        //
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        StringBuilder temp = new StringBuilder();
        int x = 0;
        while (list1 != null) {
            temp.append(list1.val + "@");
            list1 = list1.next;
            x++;
        }
        while (list2 != null) {
            temp.append(list2.val + "@");
            list2 = list2.next;
            x++;
        }
        String[] split = temp.toString().split("@");
        int[] split1 = new int[split.length];
        if (split.length==1&&split[0].equals(""))return null;
        for (int i = 0; i < split.length; i++) {
            split1[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(split1);
        ListNode listNode = new ListNode(split1[0]);
        ListNode head = new ListNode();
        head.next = listNode;
        for (int i = 1; i < split1.length; i++) {
            listNode.next = new ListNode(split1[i]);
            listNode = listNode.next;
        }
        return head.next;
    }
}
