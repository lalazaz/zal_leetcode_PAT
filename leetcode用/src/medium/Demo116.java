package medium;
//116. 填充每个节点的下一个右侧节点指针

import java.util.LinkedList;

/**
 * @author zal
 * @date 2022/4/25 9:12
 */
public class Demo116 {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        root.left = node1;
        root.right = node2;

        node1.left = new Node(4);
        node1.right = new Node(5);
        node2.left = new Node(6);
        node2.right = new Node(7);

        connect(root);
        System.out.println(root);
    }

    public static Node connect(Node root) {
        if (root == null) return null;
        if (root.left!=null){
            root.left.next = root.right;
            if (root.next!=null){
                root.right.next = root.next.left;
            }
        }
        connect(root.left);
        connect(root.right);
        return root;
    }


    /**
     * @ BuringDroplets
     */
/*    public static Node connect(Node root) {
        if (root == null) return root;

        if (root.left!=null){
            root.left.next = root.right;
            if (root.next!=null){
                root.right.next = root.next.left;
            }
        }
        connect(root.left);
        connect(root.right);

        return root;
    }*/

/*    public static Node connect(Node root) {
        if (root == null) return root;
        LinkedList<Node> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()) {
            int len = que.size();
            while (len > 0) {
                Node tmpNode = que.pop();

                if (tmpNode.left != null) que.add(tmpNode.left);
                if (tmpNode.right != null) que.add(tmpNode.right);
                len--;
            }
            //此处que存放的就是每一层的结点，然后对这个队列遍历重新指向即可
            for (int i = 0; i < que.size() - 1; i++) {
                que.get(i).next = que.get(i + 1);
            }
        }
        return root;
    }*/
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
