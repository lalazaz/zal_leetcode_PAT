package demo;

/**
 * @Date 2022/3/31 9:47
 * 2. 两数相加
 **/
public class Demo02 {
    public static void main(String[] args) {

    }

    /**
     * 输入：l1 = [2,4,3], l2 = [5,6,4]
     * 输出：[7,0,8]
     * 解释：342 + 465 = 807.
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode resNode = new ListNode(0, null);
            ListNode curNode = resNode;
            int flag = 0;
            while (l1 != null || l2 != null) {
                int x = l1 != null ? l1.val : 0;
                int y = l2 != null ? l2.val : 0;
                int sumVal = 0;

                if (x + y >= 10) {
                    sumVal = x + y - 10 + flag;
                    flag = 1;
                } else {
                    sumVal = x + y + flag;
                }
                ListNode sumNode = new ListNode(0, null);
                sumNode.val = sumVal;
                curNode.next = sumNode;
                curNode = curNode.next;
                if (l1 != null) l1 = l1.next;
                if (l2 != null) l2 = l2.next;
            }

            return resNode.next;
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
}