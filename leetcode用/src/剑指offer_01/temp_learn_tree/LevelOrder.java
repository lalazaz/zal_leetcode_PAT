package 剑指offer_01.temp_learn_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zal
 * @date 2022/4/24 10:49
 */
//层序遍历
public class LevelOrder {
    public static List<List<Integer>> resList = new ArrayList<List<Integer>>();

    public static void main(String[] args) {
        //构造一个tree
        TreeNode root = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        root.left = treeNode2;
        root.right = treeNode3;
        treeNode2.left = new TreeNode(4);
        treeNode2.right = new TreeNode(5);

        //DFS -- 递归法
//        checkFun01(root,0);
        //BFS -- 迭代方法  借助队列
        checkFun02(root);
        System.out.println(resList);
    }

    //DFS -- 递归法  多写
    public static void checkFun01(TreeNode node, Integer deep) {
        if (node == null) return;
        deep++;
        if (resList.size() < deep) {
            //当层级增加的时候，对应的item也增加，利用list的索引值进行层级界定
            List<Integer> item = new ArrayList<>();
            resList.add(item);
        }
        resList.get(deep - 1).add(node.val);
        checkFun01(node.left, deep);
        checkFun01(node.right, deep);
    }


    //BFS -- 迭代方法  借助队列   重要
    public static void checkFun02(TreeNode node) {
        if (node == null) return;
        LinkedList<TreeNode> que = new LinkedList<>();
        que.add(node);

        while (!que.isEmpty()) {
            ArrayList<Integer> itemList = new ArrayList<>();
            int len = que.size();

            //开始拿到所有队列中结点的val
            while (len > 0) {
                TreeNode temNode = que.pop();
                itemList.add(temNode.val);

                //开始把这个结点的左右结点入队（如果有的话）
                if (temNode.left != null) que.add(temNode.left);
                if (temNode.right != null) que.add(temNode.right);
                len--;
            }
            //遍历完一层，加到结果上去
            resList.add(itemList);
        }
    }












/*    //BFS -- 迭代方法  借助队列   重要
    public static void checkFun02(TreeNode node){
        if (node==null)return;
        LinkedList<TreeNode> que = new LinkedList<>();
        que.offer(node);

        while (!que.isEmpty()) {
            List<Integer> itemList = new ArrayList<>();
            int len = que.size();

            while (len > 0) {
                TreeNode tmpNode = que.poll();
                itemList.add(tmpNode.val);

                if (tmpNode.left != null) que.offer(tmpNode.left);
                if (tmpNode.right != null) que.offer(tmpNode.right);
                len--;
            }

            resList.add(itemList);
        }
    }*/

}
