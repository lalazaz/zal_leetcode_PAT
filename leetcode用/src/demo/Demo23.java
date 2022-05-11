package demo;

import java.util.Arrays;

//@Date 2022/4/15 10:36
//23. 合并K个升序链表
public class Demo23 {
    public static void main(String[] args) {

    }
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0)return null;
        if (lists.length==1&&lists[0]==null)return null;

        StringBuilder temp = new StringBuilder();
        int x = 0;
        //
        for (int i = 0; i < lists.length; i++) {
            while (lists[i] != null) {
                temp.append(lists[i].val + "@");
                lists[i] = lists[i].next;
                x++;
            }
        }
        //
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
